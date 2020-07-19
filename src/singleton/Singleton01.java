package singleton;
/**
 * 饿汉式
 * 类加载到内存中，就实例化一个单例，JVM保证线程安全(JVM保证线程只会使用一次)
 * 缺点：即使不会用到也会得到加载
 */
public class Singleton01 {
    private static  final Singleton01 singleton = new Singleton01();
    private Singleton01(){};
    public static Singleton01 getInstance(){
        return singleton;
    }
}
