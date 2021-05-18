package demo;


import java.util.List;

/**
 * 具体迭代器（Concretelterator）角色：
 * 实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/18 17:58
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list = null;
    private int index = -1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        ;
        return obj;
    }
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }
}
