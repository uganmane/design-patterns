package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:34
 */
public class Main {
    public static void main(String[] args) {
        ConcreteStateA concreteStateA = new ConcreteStateA();
        Context context = new Context(concreteStateA);    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
