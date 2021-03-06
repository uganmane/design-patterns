package demo;

/**
 * 抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。
 * 在透明式的组合模式中抽象构件还声明访问和管理子类的接口；
 * 在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
 * （总的抽象类或接口，定义一些通用的方法，比如新增、删除）
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 10:21
 */
public interface Component {
    public void operation();
}
