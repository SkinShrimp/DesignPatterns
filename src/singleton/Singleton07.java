package singleton;
/**
 * 静态内部类的方式
 * JVM保证单例
 * 加载外部类的时候不会加载内部类，这样可以实现赖加载
 */
public class Singleton07 {

    private Singleton07(){};
    private static class SingletonHolder{
        private final static Singleton07 singleton = new Singleton07();
    };

    public static Singleton07 getInstance(){
       return SingletonHolder.singleton;
    }
}
