package demo;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/8 16:50
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}
