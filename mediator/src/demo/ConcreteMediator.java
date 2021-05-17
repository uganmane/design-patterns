package demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者（Concrete Mediator）角色：实现中介者接口，定义一个 List
 * 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:14
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ob.receive();
            }
        }
    }
}
