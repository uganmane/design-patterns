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
public class Singleton1 {

    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}