package demo;

/**
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 16:49
 */
public abstract class Handler {

    private Handler next;

    public abstract void handleRequest(String request);

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
