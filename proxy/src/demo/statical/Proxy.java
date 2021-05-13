package demo.statical;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/10 16:31
 */
public class Proxy implements Subject{
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }
    private void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
