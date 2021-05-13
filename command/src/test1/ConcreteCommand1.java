package test1;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 16:27
 */
public class ConcreteCommand1 extends AbstractCommand{

    private CompositeReceiver receiver;

    ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }

    public void execute() {
        receiver.action1();
    }

}
