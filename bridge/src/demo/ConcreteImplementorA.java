package demo;


/**
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:54
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
