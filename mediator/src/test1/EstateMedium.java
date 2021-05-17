package test1;


import java.util.ArrayList;
import java.util.List;

/**
 * //具体中介者：房地产中介
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/17 14:33
 */
public class EstateMedium implements Medium{

    public List<Customer> members = new ArrayList<>();

    @Override
    public void register(Customer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        for (Customer ob : members) {
            String name = ob.getName();
            if (!name.equals(from)) {
                ob.receive(from, ad);
            }
        }
    }
}
