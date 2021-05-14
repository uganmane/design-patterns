package demo;


/**
 * 测试类
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:33
 */
public class Main {
    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        concreteSubject.add(observerA);
        concreteSubject.add(observerB);
        concreteSubject.notifyObserver();
    }
}
