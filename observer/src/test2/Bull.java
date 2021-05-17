package test2;


import java.util.Observable;
import java.util.Observer;

/**
 * 多方
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 16:41
 */
public class Bull implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = (Float) arg;
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
