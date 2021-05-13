package demo;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:14
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
