package demo;

/**
 * 9.枚举单例 推荐指数：★★★★★
 * 优点：使用到的时候才会创建对象，不会造成各种资源浪费问题，线程安全。
 * 缺点：最优方案
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton9 {


    private Singleton9() {
    }

    private enum SingletonEnum {
        /**
         * 枚举单例
         */
        SINGLETON;

        private Singleton9 singleton;

        SingletonEnum() {
            singleton = new Singleton9();
        }

        public Singleton9 getInstance() {
            return singleton;
        }
    }

    public Singleton9 getInstance() {
        return SingletonEnum.SINGLETON.getInstance();
    }

}