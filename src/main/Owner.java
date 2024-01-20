package main;

public class Owner {
    private int money = 0;

    public void getSales(int price) {
        changeMoney(getMoney() + (price - 2 * (price / 10)));
    }

    public int getMoney() {
        return  money;
    }
    public void changeMoney(int moneyToChange) {
        this.money = moneyToChange;
    }

}
