package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;

import tpfinaltaller1.modelo.Almacen;

import tpfinaltaller1.modelo.AlmacenExistenteException;
import tpfinaltaller1.modelo.AlmacenInexistenteException;
import tpfinaltaller1.modelo.Analisis;
import tpfinaltaller1.modelo.AnalisisInexistenteException;
import tpfinaltaller1.modelo.Persistencia;
import tpfinaltaller1.modelo.SintaxisEquivocadaException;

import tpfinaltaller1.vista.InterfazVista;

public class Controlador implements ActionListener
{

    private Almacen almacenActual;
    private InterfazVista ventanaActual;
    private String comandoActual;


    public void setAlmacenActual(Almacen almacenActual) {
        this.almacenActual = almacenActual;
    }

    public void setComandoActual(String comandoActual) {
        this.comandoActual = comandoActual;
    }

    public Controlador(InterfazVista ventanaActual) {
        this.ventanaActual = ventanaActual;
    }

    private void crear(String nombreAlmacen) throws AlmacenExistenteException {
    	if(this.almacenActual == null){
            if(!Persistencia.existe(nombreAlmacen)){
    		this.almacenActual= new Almacen(nombreAlmacen);
            }else{
                throw new AlmacenExistenteException("ERROR 004: operacion no realizable (Ya existe un almacen con dicho nombre)");
            }
    	}
    }
    
    private void cargar(String nombreAlmacen) throws FileNotFoundException {
        almacenActual = (Almacen) Persistencia.abrir(nombreAlmacen);
    }
    
    private void guardar() throws AlmacenInexistenteException, FileNotFoundException {
        if(this.almacenActual != null)
        {
            Persistencia.guardar(almacenActual, almacenActual.getNombre());
        }
      else
        {
        	throw new AlmacenInexistenteException("ERROR 004: operacion no realizable (No hay un almacen cargado)");
        }
    }
    
    private void importar(String nombreArchivo) throws AlmacenInexistenteException, FileNotFoundException {
        Analisis nuevo = (Analisis) Persistencia.abrir(nombreArchivo);
        if(this.almacenActual != null){
            this.almacenActual.agregarAnalisis(nuevo);
        } else {
            throw new AlmacenInexistenteException("ERROR 004: operacion no realizable (No hay un almacen cargado)");
        }
    }
    
    private void eliminar(int idAnalisis) throws AlmacenInexistenteException, AnalisisInexistenteException{
        this.almacenActual.eliminar(idAnalisis);
    }
    
    private void consultar(String[] parametros) throws SintaxisEquivocadaException, FileNotFoundException {
        String archivo;
        ArrayList<Analisis> resultado = this.almacenActual.consultar(parametros);
        ventanaActual.mostrarResultados(resultado);
        if(parametros.length > 3){
            if(parametros[3].equals("toFile")){
                archivo = parametros[4];
                Persistencia.guardar(resultado, archivo);
            }else{
                throw new SintaxisEquivocadaException("ERROR 002: Consulta mal construida");
            }
        }
    }
    
    private void analizarComando(String comando) throws SintaxisEquivocadaException, AlmacenInexistenteException,
                                                        AnalisisInexistenteException, FileNotFoundException,
                                                        AlmacenExistenteException {
        String[] comandos = comando.split(" ");
        String orden = comandos[0].toUpperCase();
        switch(orden){
        case "CREAR":
            this.crear(comandos[1]);
            break;
        case "CARGAR":
            this.cargar(comandos[1]);
            break;
        case "GUARDAR":
            this.guardar();
            break;
        case "IMPORTAR":
            this.importar(comandos[1]);
            break;
        case "ELIMINAR":
            this.eliminar(Integer.parseInt(comandos[1]));
            break;
        case "CONSULTAR":
            this.consultar(Arrays.copyOfRange(comandos, 1, comandos.length));
            break;
        default:
            throw new SintaxisEquivocadaException("ERROR 001: Comando equivocado " + comandos[0]);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        comandoActual = ventanaActual.getComando();
        try {
            if(e.getActionCommand().equals(InterfazVista.EJECUTAR)){
                analizarComando(comandoActual);
            }
        } catch (SintaxisEquivocadaException f) {
            ventanaActual.mostrarError(f.getMessage());
        } catch (AlmacenInexistenteException f) {
            ventanaActual.mostrarError(f.getMessage());
        } catch (AnalisisInexistenteException f) {
            ventanaActual.mostrarError(f.getMessage());
        } catch (FileNotFoundException f){
            ventanaActual.mostrarError(f.getMessage());
        } catch (AlmacenExistenteException f){
            ventanaActual.mostrarError(f.getMessage());
        }
    }
}
