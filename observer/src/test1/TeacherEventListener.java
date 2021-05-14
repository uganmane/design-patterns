package test1;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:59
 */
public class TeacherEventListener implements EventListener{
    @Override
    public void heardBell(RingEvent event) {
        System.out.println(event.getSound() ? "老师上课了" : "老师下课了");
    }
}
