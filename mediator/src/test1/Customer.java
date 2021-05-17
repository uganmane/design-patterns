package test1;


/**
 *
 * 抽象同事类：客户
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:31
 */
public abstract class Customer {
    protected Medium medium;
    protected String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public abstract void send(String ad);

    public abstract void receive(String from, String ad);
}
