package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 17:52
 */
public class Girl extends Changer{
    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    public void display() {
        super.display();
        setChanger();
    }
    public void setChanger() {
        System.out.println("莫莉卡变身-少女");
    }
}
