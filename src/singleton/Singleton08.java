package singleton;
/**
 * 不仅可以解决线程同步，还可以防止反序列化(枚举单例)
 */
public enum  Singleton08 {
    INSTANCE;
}
