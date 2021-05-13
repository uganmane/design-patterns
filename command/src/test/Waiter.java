package test;


/**
 * TODO
 *
 * @author 李响
 * @email zoroikuzo@qq.com
 * @date 2021/5/13 11:58
 */
public class Waiter {

    private Breakfast changfen, huntun, hefen;

    public void setChangfen(Breakfast changfen) {
        this.changfen = changfen;
    }

    public void setHuntun(Breakfast huntun) {
        this.huntun = huntun;
    }

    public void setHefen(Breakfast hefen) {
        this.hefen = hefen;
    }

    public void chooseChangFen() {
        changfen.cooking();
    }
    public void chooseHunTun() {
        huntun.cooking();
    }
    public void chooseHeFen() {
        hefen.cooking();
    }
}
