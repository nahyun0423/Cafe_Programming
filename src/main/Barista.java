package main;

public class Barista extends Person {
    public Barista(String name, int money) {
        super(name, money);
    }

    public void makeCoffee(Menu coffee, String temperature, int price) {
        System.out.println(temperature + coffee + " 제조 완료되었습니다.");
        System.out.println("\n");
        getIncentive(price);
    }

    public void getIncentive(int price) {
        if (getName() == this.getName()) {
            changeMoney(getMoney() + (price / 10));
        }
    }
}
