package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:59
 */
public class BagManage {

    public static void main(String[] args) {
        Color yellow = new Yellow();
        Wallet wallet = new Wallet();
        wallet.setColor(yellow);
        String name = wallet.getName();
        System.out.println(name);
        Red red = new Red();
        wallet.setColor(red);
        name = wallet.getName();
        System.out.println(name);
    }

}
