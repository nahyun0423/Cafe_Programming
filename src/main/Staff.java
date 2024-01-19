package main;

public class Staff {
    private String name;
    private int money;
    private int startTime;
    private int endTime;

    public Staff(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void changeMoney(int moneyToChange) {
        this.money = moneyToChange;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public int requestPay() {

    }
}
