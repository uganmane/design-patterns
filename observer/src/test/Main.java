package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/14 10:47
 */
public class Main {
    public static void main(String[] args) {
        Rate rate = new RmbRate();
        ImportCompany importCompany = new ImportCompany();
        ExportCompany exportCompany = new ExportCompany();
        rate.add(importCompany);
        rate.add(exportCompany);
        rate.change(1);
        rate.change(10);
        rate.change(-9);
    }
}
