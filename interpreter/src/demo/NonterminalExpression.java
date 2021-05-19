package demo;


/**
 * 非终结符表达式（Nonterminal Expression）角色：
 * 也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/19 11:28
 */
public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;

    public void interpret(String info) {
        //非对终结符表达式的处理
    }
}
