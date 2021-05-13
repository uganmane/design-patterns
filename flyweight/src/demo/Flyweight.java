package demo;

/**
 * 抽象享元角色（Flyweight）：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，
 * 非享元的外部状态以参数的形式通过方法传入。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 9:27
 */
public interface Flyweight {

    public void operation(UnsharedConcreteFlyweight state);

}
