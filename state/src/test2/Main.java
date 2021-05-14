package test2;


/**
 * 整一个上下文对象，聚合状态对象。
 * 上下文对象的方法，改变状态。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 18:08
 */
public class Main {
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
