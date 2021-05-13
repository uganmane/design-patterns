package demo;


/**
 * 抽象状态（State）角色：定义一个接口，
 * 用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 17:31
 */
public interface State {
    void Handle(Context context);
}
