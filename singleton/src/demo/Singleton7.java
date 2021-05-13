package demo;

/**
 *
 *
 * 7.双重检查优化版（线程安全） 推荐指数：★★★★☆
 * 优点：使用到的时候才会创建对象，不会造成各种资源浪费问题。
 * 缺点：复杂。
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton7 {

    private volatile static Singleton7 instance;

    private Singleton7() {

    }

    public static Singleton7 getInstance() {
        if (instance == null) {
            synchronized (Singleton7.class) {
                if (instance == null) {
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}