package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 11:44
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new ConcreteReceiverA();
        Command command = new ConcreteCommandA(receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
