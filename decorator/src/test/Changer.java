package test;


/**
 * 抽象装饰角色：变形
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 17:51
 */
public class Changer implements Morrigan{

    private Morrigan morrigan;

    public Changer(Morrigan morrigan) {
        this.morrigan = morrigan;
    }

    @Override
    public void display() {
        morrigan.display();
    }
}
