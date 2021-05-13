package test;


import java.util.ArrayList;

/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/12 10:31
 */
public class Bags implements Articles {

    private String name;     //名字
    private ArrayList<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Articles obj : bags) {
            s += obj.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Articles obj : bags) {
            obj.show();
        }
    }
}
