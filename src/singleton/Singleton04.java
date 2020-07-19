package singleton;
/**
 * lazy loading
 * 懒汉式
 * 缺点:线程不安全 使用 synchronized 加锁(效率会变低)
 */
public class Singleton04 {

    private static Singleton04 singleton;
    private Singleton04(){};
    public synchronized static Singleton04 getInstance(){

        if(singleton == null){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            return singleton=new Singleton04();
        }
        return singleton;
    }
}
