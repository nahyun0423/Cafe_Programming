package main;

public class Barista extends Person {
    public Barista(int id, String name, int money) {
        super(id, name, money);
    }

    public void makeCoffee(Menu coffee, String temperature) {
        System.out.println(coffee + " 제조 완료되었습니다.");
        System.out.println("\n");
    }

    public void getIncentive(Barista barista, int price) {
        if (getId() == barista.getId()) {
            changeMoney(getMoney() + (price / 10));
            System.out.println(getName() + " 바리스타 인센티브 :" + getMoney());
        }
    }
}
