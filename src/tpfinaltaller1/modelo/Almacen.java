package tpfinaltaller1.modelo;

import java.util.ArrayList;

public class Almacen
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

    public ArrayList<Analisis> consultar(String comando)
    {
        return null;
    }
}
