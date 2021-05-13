package demo;


/**
 * 具体构件（ConcreteComponent）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 17:41
 */
public class ConcreteComponent implements Component{
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
