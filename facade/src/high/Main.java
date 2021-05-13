package high;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 18:20
 */
public class Main {
    public static void main(String[] args) {
        AbstractFacade af1 = new Facade1();
        af1.method1();
        af1.method2();
        AbstractFacade af2 = new Facade2();
        af2.method1();
        af2.method2();
    }
}
