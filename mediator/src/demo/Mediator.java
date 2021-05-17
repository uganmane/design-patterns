package demo;


/**
 * 抽象中介者（Mediator）角色：它是中介者的接口，
 * 提供了同事对象注册与转发同事对象信息的抽象方法。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:11
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发

}
