package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 11:55
 */
public class ChangFen implements Breakfast{

    private Chef chef = new ChangFenChef();

    @Override
    public void cooking() {
        chef.cooking();
    }
}
