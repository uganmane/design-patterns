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
    public Product newProduct() {
        System.out.println("具体工厂2  -> 产品A");
        return new ConcreteProductA();
    }

}
