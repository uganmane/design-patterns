package demo;


/**
 *
 * 抽象表达式（Abstract Expression）角色：
 * 定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/19 10:23
 */
public interface AbstractExpression {
    void interpret(String info);
}
