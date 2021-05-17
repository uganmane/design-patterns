package test1;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:37
 */
public class Seller extends Customer{

    public Seller(String name) {
        super(name);
    }

    public void send(String ad) {
        System.out.println("我(卖方)说: " + ad + "\n");
        medium.relay(name, ad);
    }

    public void receive(String from, String ad) {
        System.out.println(from + "说: " + ad + "\n");
    }
}
