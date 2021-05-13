package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/11 16:19
 */
public class OpticalAdapter implements Motor{

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        opticalMotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
