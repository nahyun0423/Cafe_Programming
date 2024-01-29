package main;

public class Cashier extends Staff {
    private Barista barista;

    public Cashier(String name, int totalOrder, Barista barista) {
        super(name, totalOrder);
        this.barista = barista;
    }

    public void processOrder(Customer customer, Menu coffee) {
        int price = coffee.getPrice();

        if (customer.payMoney(price)) {
            barista.makeCoffee(coffee);
            changeTotalOrder(getTotalOrder() + 1);
            Owner.getSales(price);
        }
    }
}
