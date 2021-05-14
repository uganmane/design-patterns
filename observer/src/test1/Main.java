package test1;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 11:06
 */
public class Main {
    public static void main(String[] args) {
        BellEventSource bellEventSource = new BellEventSource();
        TeacherEventListener teacherEventListener = new TeacherEventListener();
        StudentEventListener studentEventListener = new StudentEventListener();
        bellEventSource.addListener(teacherEventListener);
        bellEventSource.addListener(studentEventListener);
        bellEventSource.ring(false);
        System.out.println("---------------------------");
        bellEventSource.ring(true);
    }
}
