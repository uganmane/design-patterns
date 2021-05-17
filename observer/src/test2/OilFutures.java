package test2;


import java.util.Observable;

/**
 * 原油期货
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 16:39
 */
public class OilFutures extends Observable {
    private float price;

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        super.setChanged();  //设置内部标志位，注明数据发生变化
        super.notifyObservers(price);    //通知观察者价格改变了
        this.price = price;
    }
}
