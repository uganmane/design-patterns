package demo;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/10 9:40
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂2  -> 产品1");
        return new ConcreteProduct12();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂2  -> 产品2");
        return new ConcreteProduct22();
    }
}
