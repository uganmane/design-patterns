package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 11:55
 */
public class HeFen implements Breakfast{

    private Chef chef = new HeFenChef();

    @Override
    public void cooking() {
        chef.cooking();
    }
}
