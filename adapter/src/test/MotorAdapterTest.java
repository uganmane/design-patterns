package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:22
 */
public class MotorAdapterTest {
    public static void main(String[] args) {
        Motor motor = new ElectricAdapter();
        motor.drive();
        Motor motor1 = new OpticalAdapter();
        motor1.drive();
    }
}
