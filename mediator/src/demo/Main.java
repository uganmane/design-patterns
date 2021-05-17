package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:19
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();
        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.send();
        System.out.println("------------------------------------");
        colleague2.send();
    }
}
