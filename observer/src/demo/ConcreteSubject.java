package demo;


/**
 * 具体主题（Concrete Subject）角色：也叫具体目标类，
 * 它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:28
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Observer obs : observers) {
            obs.response();
        }

    }
}
