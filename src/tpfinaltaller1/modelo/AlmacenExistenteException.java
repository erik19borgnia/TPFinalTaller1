package tpfinaltaller1.modelo;

public class AlmacenExistenteException extends Exception {
    public AlmacenExistenteException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public AlmacenExistenteException(Throwable throwable) {
        super(throwable);
    }

    public AlmacenExistenteException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public AlmacenExistenteException(String string) {
        super(string);
    }

    public AlmacenExistenteException() {
        super();
    }
}
