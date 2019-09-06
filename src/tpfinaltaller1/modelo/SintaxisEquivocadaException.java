package tpfinaltaller1.modelo;

public class SintaxisEquivocadaException extends Exception {
    public SintaxisEquivocadaException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public SintaxisEquivocadaException(Throwable throwable) {
        super(throwable);
    }

    public SintaxisEquivocadaException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public SintaxisEquivocadaException(String string) {
        super(string);
    }

    public SintaxisEquivocadaException() {
        super();
    }
}
