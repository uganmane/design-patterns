package test.proxy.statical;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:14
 */
public class Main {
    public static void main(String[] args) {
        HouseProxy houseProxy = new HouseProxy(new JNVank());
        houseProxy.display();
    }
}
