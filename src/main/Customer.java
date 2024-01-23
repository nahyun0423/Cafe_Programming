package main;

public class Customer {
    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void orderCoffee(Cashier cashier, Menu coffee) {
        cashier.processOrder(this, coffee);
    }

    public boolean payMoney(int price) {
        int money = getMoney() - price;

        if (money < 0) {
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        changeMoney(money);
        System.out.println("==결제 완료==");
        System.out.println(getName() + "님의 잔액 : " + getMoney());
        return true;
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
}
