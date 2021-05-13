package demo.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理具体步骤：
 *
 * 通过实现 InvocationHandler 接口创建自己的调用处理器；
 * 通过为 Proxy 类指定 ClassLoader 对象和一组 interface 来创建动态代理类；
 * 通过反射机制获得动态代理类的构造函数，其唯一参数类型是调用处理器接口类型；
 * 通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数被传入。
 *
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/10 16:37
 */
public class Main {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloInterface hello = new Hello();
        InvocationHandler handler = new ProxyHandler(hello);
        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);
        proxyHello.sayHello();
    }
}
