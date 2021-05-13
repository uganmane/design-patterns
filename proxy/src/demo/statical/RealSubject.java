package demo.statical;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/10 16:30
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
