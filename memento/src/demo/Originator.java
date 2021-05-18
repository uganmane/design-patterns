package demo;


/**
 * 发起人（Originator）角色：
 * 记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，
 * 实现其他业务功能，它可以访问备忘录里的所有信息。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/18 18:15
 */
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
