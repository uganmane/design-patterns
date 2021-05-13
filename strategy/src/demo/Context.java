package demo;


/**
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 9:46
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
