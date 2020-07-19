package singleton;
/**
 * lazy loading
 * 懒汉式
 * 缺点:线程不安全 使用 synchronized 加锁(效率会变低)
 */
public class Singleton06 {
    private static Singleton06 singleton;
    private Singleton06(){};
    public static Singleton06 getInstance(){
        //双重检验
        if(singleton == null){
            synchronized(Singleton06.class) {
                if(singleton == null) {
                    return singleton = new Singleton06();
                }
            }
        }
        return singleton;
    }
}
