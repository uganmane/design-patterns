package demo;

/**
 *
 * 5.懒汉式改造（线程不安全） 推荐指数：☆☆☆☆☆
 * 优点：使用到的时候才会创建对象，不会造成各种资源浪费问题。
 * 缺点：线程不安全，还有性能问题！多个线程在synchronized那一行排队，进入代码块后一样会创建多个对象。
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}