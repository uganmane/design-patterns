package high;


import demo.SubSystem01;
import demo.SubSystem02;
import demo.SubSystem03;
import demo.SubSystem04;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 18:07
 */
public class Facade2 implements AbstractFacade{
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    private SubSystem04 obj4 = new SubSystem04();

    @Override
    public void method1() {
        obj2.method2();
        obj3.method3();
    }

    @Override
    public void method2() {
        obj3.method3();
        obj4.method4();
    }
}
