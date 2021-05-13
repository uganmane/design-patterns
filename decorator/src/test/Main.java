package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 17:53
 */
public class Main {
    public static void main(String[] args) {
        Morrigan m = new Original();
        m.display();
        System.out.println("-------------------------");
        Morrigan m1 = new Succubus(m);
        m1.display();
        System.out.println("-------------------------");
        Morrigan m2 = new Girl(m);
        m2.display();
    }
}
