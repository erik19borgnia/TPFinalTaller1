package tpfinaltaller1.modelo;

public class AnalisisInexistenteException extends Exception {
    public AnalisisInexistenteException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public AnalisisInexistenteException(Throwable throwable) {
        super(throwable);
    }

    public AnalisisInexistenteException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public AnalisisInexistenteException(String string) {
        super(string);
    }

    public AnalisisInexistenteException() {
        super();
    }
}
