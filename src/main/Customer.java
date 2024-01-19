package main;

public class Customer {
    private String id;
    private int money;

    public Customer(String id, int money) {
        this.id = id;
        this.money = money;
    }

    public void changeMoney(int moneyToChange) {
        this.money = moneyToChange;
    }

    public int getMoney() {
        return money;
    }

    public String getId() {
        return id;
    }

    public void orderCoffee(Cashier cashier, Barista barista, Menu coffee, String temperature) throws Exception {
        cashier.calculate(this, barista, coffee, temperature);
    }

    public void payMoney(int price) throws Exception {
        int money = getMoney() - price;
        changeMoney(money);

        if (money < 0) {
            System.out.println("잔액이 부족합니다.");
            throw new Exception("잔액이 부족합니다.");
        } else {
            System.out.println("==결제 완료==");
            System.out.println(getId() + "님의 잔액 : " + getMoney());
        }
    }
}
