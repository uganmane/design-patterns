package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 13:40
 */
public class HookTemplateMethod {

    public static void main(String[] args) {
        HookAbstractClass hac = new HookConcreteClass();
        hac.TemplateMethod();
    }
}
