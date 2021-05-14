package test1;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:59
 */
public class StudentEventListener implements EventListener{
    @Override
    public void heardBell(RingEvent event) {
        System.out.println(event.getSound() ? "同学们上课了" : "同学们下课了");
    }
}
