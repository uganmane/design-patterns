package demo;

/**
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/18 17:56
 */
public interface Iterator {

    boolean hasNext();

    Object next();

    Object first();
}
