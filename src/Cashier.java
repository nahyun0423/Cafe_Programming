public class Cashier extends Person {
    public Cashier(int id, String name, int money) {
        super(id, name, money);
    }

    public int makeCoffee(Menu.MenuItem coffee, int price) {
        int money = getMoney() + price;
        System.out.println(price + "원 " + coffee + " 제조");
        changeMoney(money);
        System.out.println("가게 매출 : " + getMoney() + "\n========\n");
        return price;
    }
}
