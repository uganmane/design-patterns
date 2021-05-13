package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 16:53
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
