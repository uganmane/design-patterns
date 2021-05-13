package demo.dynamic;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/10 16:37
 */
public class HelloProxy implements HelloInterface{
    private HelloInterface helloInterface = new Hello();
    @Override
    public void sayHello() {
        System.out.println("Before invoke sayHello" );
        helloInterface.sayHello();
        System.out.println("After invoke sayHello");
    }
}
