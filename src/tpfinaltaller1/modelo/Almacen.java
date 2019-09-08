package tpfinaltaller1.modelo;

import java.io.Serializable;

import java.util.ArrayList;

public class Almacen implements Serializable
{
    private ArrayList<Analisis> analisis;
  
    public Almacen(String nombre)
    {
       this.nombre=nombre;
       this.analisis= new ArrayList<Analisis>();
    }
    private String nombre;
    
    public void importar(String nombreArchivo)
    {
        
    }
    
    public void eliminar(int idAnalisis)
    {

    }

    public ArrayList<Analisis> consultar(String[] comando)
    {
        return null;
    }

    public void agregarAnalisis(Analisis nuevo) {
    }

    public String getNombre() {
        return null;
    }
}
