package SingletonPackage;

public final class Singleton {
    private static volatile Singleton instanceObj;
    public String value;

    private Singleton(String val) {
        value = val;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instanceObj;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instanceObj == null) {
                instanceObj = new Singleton(value);
            }
            return instanceObj;
        }
    }
}
