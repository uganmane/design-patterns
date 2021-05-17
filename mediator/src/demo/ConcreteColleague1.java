package demo;


/**
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，
 * 当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:17
 */
public class ConcreteColleague1 extends Colleague {
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }

}
