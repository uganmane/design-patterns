package demo;

/**
 * 具体原型类
 *
 * @author lixiang（2021/5/8 15:21）
 * @version 1.0
 */

public class Realizetype implements Cloneable{
    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}
