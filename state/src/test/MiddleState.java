package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:52
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}
