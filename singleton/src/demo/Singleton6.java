package demo;

/**
 *
 * 6.双重检查缺陷版（线程不安全） 推荐指数：☆☆☆☆☆
 * 优点：使用到的时候才会创建对象，不会造成各种资源浪费问题。
 * 缺点：线程不安全，这里的线程不安全要涉及到对象的创建过程和指令重排序。
 *
 *
 * 详细讨论：
 *
 * 这个优化我们利用了双重检测机制和同步锁，这种方式也称为双重同步锁单例模式，但是这个案例还是线程不安全的，
 * 大家通过代码层面的分析后，发现确实不会有线程安全问题，那问题出现在哪呢？
 * 这个其实要和对象创建步骤和Jvm指令重排挂钩，我们正常创建对象的指令步骤是这样的：
 *
 * memory = allocate() 分配对象的内存空间
 * ctorInstance() 初始化对象
 * instance = memory 设置instance指向刚分配的内存
 * 但是因为JVM和cpu优化，发生了指令重排，
 *
 * memory = allocate() 分配对象的内存空间
 * instance = memory 设置instance指向刚分配的内存
 * ctorInstance() 初始化对象
 * 我们可以结合代码，假如A线程进入同步代码块执行instance = new Singleton6()，
 * 执行到“instance = memory 设置instance指向刚分配的内存”，
 * 这个时候B线程在第一次执行“if (instance == null)”，发现instance不为空，
 * 直接返回instance实例，其实线程B得到的这个实例并没有完全初始化（A还没有执行完对象的初始化步骤）就已经使用了。
 *
 * 关于对象创建过程可以参考 Java对象的创建、内存布局和访问定位
 *
 * 那如何禁止指令重排呢，很简单，用我们前面文章提到的volatile关键字就可以了
 *
 * @author: 李响
 * @email: lixiang@soflyit.com
 * @date: 2021/5/8 11:45
 */
public class Singleton6 {

    private static Singleton6 instance;

    private Singleton6() {

    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}