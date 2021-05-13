package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:56
 */
public abstract class AbstractClass {

    void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    private void specificMethod() {
        System.out.println("这是父类的具体方法");
    }

    protected abstract void abstractMethod1();

    protected abstract void abstractMethod2();
}
