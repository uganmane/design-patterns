package demo;


/**
 * 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，
 * 环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 9:37
 */
public interface Strategy {
    void strategyMethod();
}
