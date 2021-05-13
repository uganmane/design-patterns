package test.adapter;

/**
 * 适配者
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:24
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
