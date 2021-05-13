package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:17
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.request();
    }
}
