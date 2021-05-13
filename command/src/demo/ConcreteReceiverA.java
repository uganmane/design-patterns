package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 11:42
 */
public class ConcreteReceiverA implements Receiver{
    @Override
    public void action() {
        System.out.println("具体接受者A实现action()方法！！");
    }
}
