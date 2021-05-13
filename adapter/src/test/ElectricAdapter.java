package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:19
 */
public class ElectricAdapter extends ElectricMotor implements Motor {

    private ElectricMotor emotor;

    public ElectricAdapter() {
        emotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        emotor.electricDrive();
    }
}
