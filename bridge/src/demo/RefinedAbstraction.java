package demo;


/**
 * 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，
 * 并通过组合关系调用实现化角色中的业务方法。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:56
 */
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.operationImpl();
    }
}
