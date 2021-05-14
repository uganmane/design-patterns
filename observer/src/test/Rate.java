package test;


import java.util.ArrayList;
import java.util.List;

/**
 * RMB汇率
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:40
 */
public abstract class Rate {
    public List<Company> companies = new ArrayList<>();

    public void add(Company company) {
        companies.add(company);
    }

    public void remove(Company company) {
        companies.remove(company);
    }

    public abstract void change(int num);
}
