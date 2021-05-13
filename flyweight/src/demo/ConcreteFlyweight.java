package demo;


/**
 * 具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 9:29
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + state.getInfo());
    }
}
