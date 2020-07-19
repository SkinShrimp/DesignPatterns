/**
 * 懒汉式
 * 类加载到内存中，就实例化一个单例，JVM保证线程安全
 * 缺点：即使不会用到也会得到加载
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("哈哈哈");
    }
}
