package demo;

/**
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:52
 */
public abstract class Abstraction  {
    protected Implementor imple;
    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }
    public abstract void operation();
}
