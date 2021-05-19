package test;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/19 11:40
 */
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    public boolean interpret(String info) {
        return set.contains(info);
    }
}
