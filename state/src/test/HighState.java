package test;


/**
 * TODO
 *
 * @author ζε
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:50
 */
public class HighState extends AbstractState{

    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "δΌη§";
        score = state.score;
    }

    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}
