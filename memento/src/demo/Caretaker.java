package demo;


/**
 * 管理者（Caretaker）角色：对备忘录进行管理，
 * 提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/18 18:19
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
