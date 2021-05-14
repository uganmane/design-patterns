package demo;


/**
 * 具体观察者（Concrete Observer）角色：
 * 实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:31
 */
public class ConcreteObserverA implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者A做出反应");
    }
}
