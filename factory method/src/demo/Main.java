package demo;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/8 18:04
 */
public class Main {
    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af = new ConcreteFactory1();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
