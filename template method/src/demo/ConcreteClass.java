package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:58
 */
public class ConcreteClass extends AbstractClass{
    @Override
    protected void abstractMethod1() {
        System.out.println("这是子类抽象方法1实现");
    }

    @Override
    protected void abstractMethod2() {
        System.out.println("这是子类抽象方法2实现");
    }
}
