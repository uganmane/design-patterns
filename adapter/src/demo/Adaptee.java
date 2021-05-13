package demo;


/**
 * 适配者类，它是被访问和适配的现存组件库中的组件接口。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:13
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
