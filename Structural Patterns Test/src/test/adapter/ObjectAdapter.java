package test.adapter;


/**
 * 对象适配器
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:26
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
