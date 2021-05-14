package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:45
 */
public class RmbRate extends Rate{
    @Override
    public void change(int number) {

        for (Company obs : companies) {
            obs.response(number);
        }
    }
}
