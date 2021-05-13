package demo;

/**
 *
 * 4.懒汉式改造（线程安全） 推荐指数：★★☆☆☆
 * 优点：使用到的时候才会创建对象，不会造成各种资源浪费问题。
 * 缺点：没有线程安全问题，但是有很大的性能问题，当多个线程同时到达getInstance()方法时，需要排队进入。
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {

    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}