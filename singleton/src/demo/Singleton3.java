package demo;

/**
 *
 * 3.懒汉式（线程不安全） 推荐指数：★☆☆☆☆
 * 优点：使用到的时候才会创建对象，不会造成各种资源浪费问题。
 * 缺点：有线程安全问题。
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}