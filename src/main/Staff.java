package main;

public class Staff {
    private String name;
    private int totalOrder;

    public Staff(String name, int totalOrder) {
        this.name = name;
        this.totalOrder = totalOrder;
    }

    public String getName() {
        return name;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public void changeTotalOrder(int moneyToChange) {
        this.totalOrder = moneyToChange;
    }
}
