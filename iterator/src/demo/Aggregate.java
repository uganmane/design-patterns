package demo;


/**
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/18 17:55
 */
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator getIterator();
}
