package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:50
 */
public class LowState extends AbstractState {

    public LowState(ScoreContext h) {
        hj = h;
        stateName = "不及格";
        score = 0;
    }

    public LowState(AbstractState state) {
        hj = state.hj;
        stateName = "不及格";
        score = state.score;
    }

    public void checkState() {
        if (score >= 90) {
            hj.setState(new HighState(this));
        } else if (score >= 60) {
            hj.setState(new MiddleState(this));
        }
    }

}
