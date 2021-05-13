package test;


/**
 *
 * 教务处长
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 16:59
 */
public class DeanOfStudies extends Leader{
    @Override
    public void handleRequest(int days) {
        if (days <= 20) {
            System.out.println("教务处长批准您请假" + days + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(days);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
