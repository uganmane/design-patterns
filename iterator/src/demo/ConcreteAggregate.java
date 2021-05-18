package demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/18 17:57
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
