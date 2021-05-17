package test1;

/**
 * //抽象中介者：中介公司
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:30
 */
public interface Medium {

    void register(Customer member); //客户注册

    void relay(String from, String ad); //转发
}
