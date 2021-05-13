package demo;

import demo.Singleton1;

/**
 * <p>Title: 类名</p>
 * <p>Company:山东数飞信息科技有限公司</p>
 *
 * @author lixiang（2021/5/8 14:21）
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }


}
