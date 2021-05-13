package test.proxy.statical;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:12
 */
public class HouseProxy implements HouseOwner{

    private HouseOwner houseOwner;

    public HouseProxy(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void display() {
        System.out.print("我是中介-->代售");
        houseOwner.display();
    }
}
