package test1;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 16:27
 */
public class ConcreteCommand2 extends AbstractCommand{

    private CompositeReceiver receiver;

    ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }

    public void execute() {
        receiver.action2();
    }

}
