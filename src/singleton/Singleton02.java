package singleton;

/**
 * 类似于01
 */
public class Singleton02 {
    private static  final Singleton02 singleton;
    static {
        singleton = new Singleton02();
    }
    private Singleton02(){};
    public static Singleton02 getInstance(){
        return singleton;
    }
}
