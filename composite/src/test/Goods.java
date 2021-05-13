package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 10:30
 */
public class Goods implements Articles {

    private String name;     //名字
    private int quantity;    //数量
    private float unitPrice; //单价

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return unitPrice * quantity;
    }

    @Override
    public void show() {
            System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");

    }
}
