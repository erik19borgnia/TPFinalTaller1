package tpfinaltaller1.modelo;

public class Controlador
{

    private Almacen almacenActual;

    public Controlador()
    {
        super();
    }

    private void crear(String nombreAlmacen)
    {
        if (this.almacenActual == null)
        {
            this.almacenActual = new Almacen(nombreAlmacen);
        }
    }

    private void cargar(String nombreAlmacen)
    {

    }

    private void guardar()
    {
        if (this.almacenActual != null)
        {

        } else
        {
            //excepcion
        }
    }

    private void importar(String nombreArchivo)
    {

    }

    private void eliminar(int idAnalisis)
    {


    }

    private void consultar(String parametro)
    {

    }

    public void analizarComando()
    {
    }
}
