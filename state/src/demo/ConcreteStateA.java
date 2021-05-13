package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:32
 */
public class ConcreteStateA implements State{
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
