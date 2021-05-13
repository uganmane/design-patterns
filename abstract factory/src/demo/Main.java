package demo;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/10 11:15
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory af1 = new ConcreteFactory1();
        af1.newProduct1();
        af1.newProduct2();
        AbstractFactory af2 = new ConcreteFactory2();
        af2.newProduct1();
        af2.newProduct2();
    }
}
