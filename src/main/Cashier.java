package main;

public class Cashier extends Staff {
    public Cashier(String name, int money) {
        super(name, money);
    }


    public void calculate(Customer customer, Barista barista, Menu coffee, String temperature) throws Exception {
        int price = Menu.getPrice(coffee);

        if (temperature.equals("hot")) {
            Menu.isHotAvailable(coffee);
            price -= 500;
        }

        customer.payMoney(price);
        barista.getIncentive(barista, price);

        //  barista.makeCoffee(coffee);
        requestCoffee(barista, coffee, temperature);

    }

    public void requestCoffee(Barista barista, Menu coffee, String temperature) {
        barista.makeCoffee(coffee, temperature);
    }
}
