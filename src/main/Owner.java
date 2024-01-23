package main;

public class Owner {
    private static int money = 0;

    public static void getSales(int price) {
        changeMoney(getMoney() + price);
    }

    public int giveIncentive(Staff person) {
        return person.getTotalOrder() * 500;
    }

    public static int getMoney() {
        return money;
    }

    private static void changeMoney(int moneyToChange) {
        money = moneyToChange;
    }
}
