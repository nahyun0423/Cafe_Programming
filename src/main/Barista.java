package main;

public class Barista extends Staff {
    public Barista(String name, int totalOrder) {
        super(name, totalOrder);
    }

    public void makeCoffee(Menu coffee) {
        System.out.println(coffee + " 제조 완료되었습니다.");
        System.out.println("\n");
        changeTotalOrder(getTotalOrder() + 1);
    }
}
