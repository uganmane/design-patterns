package test2;


/**
 * 死亡状态
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 18:06
 */
public class Dead extends ThreadState {

    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }

}
