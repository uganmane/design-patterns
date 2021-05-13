package demo;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/8 18:04
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Product product = makeProduct(Const.PRODUCT_A);
        product.show();
        Product product1 = makeProduct(Const.PRODUCT_B);
        product1.show();
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    public static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProductA();
            case Const.PRODUCT_B:
                return new ConcreteProductB();
        }
        return null;
    }
}
