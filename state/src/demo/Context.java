package demo;


/**
 * 环境类（Context）角色：也称为上下文，
 * 它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:30
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
