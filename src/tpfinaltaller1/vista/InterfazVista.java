package tpfinaltaller1.vista;

import controlador.Controlador;

import java.util.ArrayList;

import tpfinaltaller1.modelo.Analisis;

public interface InterfazVista {
    
    static final String EJECUTAR = "ejecutar";
        
    public void setControlador(Controlador c);
    
    public String getComando();

    public void mostrarResultados(ArrayList<Analisis> resultado);

    public void mostrarError(String string);
}
