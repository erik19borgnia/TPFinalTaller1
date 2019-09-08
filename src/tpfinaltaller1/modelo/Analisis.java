package tpfinaltaller1.modelo;

import java.util.GregorianCalendar;
import java.util.HashMap;

private static int id = 0;
private int idActual;
private GregorianCalendar fecha;
private String apellido;
private String nombre;
private String medico;
private String domicilio;
private HashMap<String,Double> estudios;

public Analisis(GregorianCalendar fecha, String apellido, String nombre, String medico, String domicilio,
                    HashMap<String, Double> estudios) {
        this.idActual = id;
        this.fecha = fecha;
        this.apellido = apellido;
        this.nombre = nombre;
        this.medico = medico;
        this.domicilio = domicilio;
        this.estudios = estudios;
        id++;
    }

    public int getIdActual() {
        return idActual;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMedico() {
        return medico;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public HashMap<String, Double> getEstudios() {
        return estudios;
    }

    public Double valorEstudio(String nombreEstudio){
       return estudios.get(nombreEstudio);
    }
}
