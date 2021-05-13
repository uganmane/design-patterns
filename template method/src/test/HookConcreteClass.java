package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 13:43
 */
public class HookConcreteClass extends HookAbstractClass{

    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }
    // public boolean HookMethod2() {
    //     return false;
    // }
}
