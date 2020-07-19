package singleton;
/**
 * lazy loading
 * 懒汉式
 * 缺点:线程不安全
 */
public class Singleton03 {
    private static   Singleton03 singleton;
    private Singleton03(){};
    public static Singleton03 getInstance(){
        if(singleton == null){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            return singleton=new Singleton03();
        }
        return singleton;
    }
}
