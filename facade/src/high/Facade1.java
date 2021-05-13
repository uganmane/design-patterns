package high;


import demo.SubSystem01;
import demo.SubSystem02;
import demo.SubSystem03;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 18:07
 */
public class Facade1 implements AbstractFacade{

    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();

    @Override
    public void method1() {
        obj1.method1();
        obj2.method2();
    }

    @Override
    public void method2() {
        obj2.method2();
        obj3.method3();
    }
}
