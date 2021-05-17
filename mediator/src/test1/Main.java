package test1;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:40
 */
public class Main {
    public static void main(String[] args) {
        Medium medium = new EstateMedium();
        Customer buyer = new Buyer("张三");
        Customer seller = new Seller("李四");
        medium.register(buyer);
        medium.register(seller);
        seller.send("你干啥呢?");
        buyer.send("买房子, 你卖吗？");
        seller.send("不卖");
        buyer.send("哦");
    }
}
