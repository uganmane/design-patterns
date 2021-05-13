package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 12:05
 */
public class Main {

    public static void main(String[] args) {
        Breakfast food1 = new ChangFen();
        Breakfast food2 = new Huntun();
        Breakfast food3 = new HeFen();
        Waiter fwy = new Waiter();
        fwy.setChangfen(food1);//设置肠粉菜单
        fwy.setHuntun(food2);  //设置河粉菜单
        fwy.setHefen(food3);   //设置馄饨菜单
        fwy.chooseChangFen();  //选择肠粉
        fwy.chooseHeFen();     //选择河粉
        fwy.chooseHunTun();    //选择馄饨
    }
}
