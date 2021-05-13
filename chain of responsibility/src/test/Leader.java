package test;


/**
 * 领导类
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 16:58
 */
public abstract class Leader {
    private Leader next;

    public abstract void handleRequest(int days);

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }
}
