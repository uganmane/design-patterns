package test.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 11:12
 */
public class HouseHandler implements InvocationHandler {

    private Object object;

    public HouseHandler(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("我是中介-->代售");
        method.invoke(object, args);
        return null;
    }
}
