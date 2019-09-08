package tpfinaltaller1.modelo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

public class Persistencia {
    
    public static final String SUBDIRECTORIO = "\\Datos";
    
    public Persistencia() {
        super();
    }
    
    public static Object abrir(String nombre)throws FileNotFoundException {
        XMLDecoder decoder = null;
        decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(SUBDIRECTORIO + nombre + ".xml")));
        return decoder.readObject();
    }
    
    public static void guardar(Serializable p, String nombre) throws FileNotFoundException {
        XMLEncoder encoder = null;
        encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SUBDIRECTORIO + nombre + ".xml")));
        encoder.writeObject(p);
        encoder.close();
    }
    
    public static boolean existe(String archivo){
        File aux = new File(SUBDIRECTORIO + "\\" + archivo + ".xml");
        return aux.exists();
    }
}
