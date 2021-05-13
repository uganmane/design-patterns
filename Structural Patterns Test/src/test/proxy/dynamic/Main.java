package test.proxy.dynamic;


import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:17
 */
public class Main {
    public static void main(String[] args) {
        HouseOwner vank = new JNVank();
        HouseHandler houseHandler = new HouseHandler(vank);
        HouseOwner houseOwner = (HouseOwner) Proxy.newProxyInstance(vank.getClass().getClassLoader(),
                vank.getClass().getInterfaces(), houseHandler);
        houseOwner.display();
    }
}
