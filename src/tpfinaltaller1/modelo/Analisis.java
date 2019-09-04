package tpfinaltaller1.modelo;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Analisis
{
    private static int id = 0;
    private int idActual;
    private GregorianCalendar fecha;
    private String apellido;
    private String nombre;
    private String medico;
    private String domicilio;
    private HashMap<String, Double> estudios;

    public Analisis()
    {
        this.idActual=id++;
    }

    public Double valorEstudio(String nombreEstudio)
    {
        return this.estudios.get(nombreEstudio);
    } 

}
