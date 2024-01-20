package main;

public class Cashier extends Person {
    Owner owner = new Owner();

    public Cashier(String name, int money) {
        super(name, money);
    }

    public void calculate(Customer customer, Barista barista, Menu coffee, String temperature) throws Exception {
        int price = Menu.getPrice(coffee);

        if (temperature.equals("hot")) {
            Menu.isHotAvailable(coffee);
            price -= 500;
        }

        if (customer.payMoney(price)) {
            requestCoffee(barista, coffee, temperature, price);
            getIncentive(price);
            owner.getSales(price);
        }
    }

    public void requestCoffee(Barista barista, Menu coffee, String temperature, int price) {
        barista.makeCoffee(coffee, temperature, price);
    }

    public void getIncentive(int price) {
        if (this.getName().equals(getName())) {
            changeMoney(getMoney() + (price / 10));
        }
    }

}
