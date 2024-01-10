public class Guest extends Person {

    public Guest(int id, String name, int money) {
        super(id, name, money);
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
            System.out.println(getName() + "님의 잔액 : " + getMoney());
        }
    }
}
