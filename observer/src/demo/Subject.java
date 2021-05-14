package demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题（Subject）角色：也叫抽象目标类，
 * 它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:24
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者方法

}
