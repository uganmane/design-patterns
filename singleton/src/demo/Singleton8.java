package demo;

/**
 *
 * 8.静态内部类方式 推荐指数：★★★☆☆
 * 优点：使用到的时候才会创建对象，不会造成各种资源浪费问题，线程安全。
 * 缺点：没有太大缺点。
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton8 {

    private Singleton8() {
    }

    private static class SingletonInstance {
        private static final Singleton8 INSTANCE = new Singleton8();
    }

    public static Singleton8 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}