package tpfinaltaller1.modelo;

public class AlmacenInexistenteException extends Exception{
    public AlmacenInexistenteException(Throwable cause) {
        // TODO Implement this method
        super(cause);
    }

    public AlmacenInexistenteException(String message, Throwable cause, boolean enableSuppression,
                                       boolean writableStackTrace) {
        // TODO Implement this method
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AlmacenInexistenteException(String message, Throwable cause) {
        // TODO Implement this method
        super(message, cause);
    }

    public AlmacenInexistenteException(String message) {
        // TODO Implement this method
        super(message);
    }

    public AlmacenInexistenteException() {
        super();
    }
}
