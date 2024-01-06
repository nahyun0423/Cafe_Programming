public class Guest extends Person {
    public Guest(int id, String name, int money) {
        super(id, name, money);
    }

    public void orderCoffee(Cashier cashier, Menu.MenuItem coffee, String temperature) throws Exception {
        int price = Menu.getPrice(coffee);

        if (temperature.equals("hot")) {
            if (coffee == Menu.MenuItem.ORANGEJUICE || coffee == Menu.MenuItem.SMOOTHIE) {
                System.out.println("해당 메뉴는 ice만 가능합니다.");
                throw new Exception("해당 메뉴는 ice만 가능합니다.");
            } else {
                price -= 500;
            }
        }

        int money = getMoney() - price;
        changeMoney(money);

        if (money < 0) {
            System.out.println("잔액이 부족합니다.");
            throw new Exception("잔액이 부족합니다.");
        } else {
            System.out.println("==결제 완료== \n'" + getName() + "'님의 잔액 : " + getMoney());
            cashier.makeCoffee(coffee, price);
        }
    }
}
