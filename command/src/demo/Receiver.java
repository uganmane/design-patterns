package demo;


/**
 * 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 11:40
 */
public interface Receiver {
    void action();
}