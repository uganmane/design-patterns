package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:50
 */
public class ScoreContext {
    private AbstractState state;

    ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}
