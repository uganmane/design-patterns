package demo;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/10 9:40
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂1  -> 产品1");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂1  -> 产品2");
        return new ConcreteProduct21();
    }
}
