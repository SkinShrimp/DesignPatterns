package singleton;
/**
 * lazy loading
 * 懒汉式
 * 缺点:线程不安全 使用 synchronized 加锁(效率会变低)
 */
public class Singleton05 {

    private static Singleton05 singleton;
    private Singleton05(){};
    public static Singleton05 getInstance(){
        if(singleton == null){
            //试图通过减小同步代码块的方法来提高效率
            synchronized(Singleton05.class) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
                return singleton = new Singleton05();
            }
        }
        return singleton;
    }
}
