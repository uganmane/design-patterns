package demo;

/**
 *
 * 1.饿汉式（静态常量） 推荐指数：★★☆☆☆
 * 优点：不会有线程安全问题。
 * 缺点：在类加载的时候就创建对象，如果一直没使用到该对象的话，就造成了内存浪费，如果对象初始化的工作很多也会影响性能。
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton2 {

    private final static Singleton2 INSTANCE;

    static {
        INSTANCE = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}