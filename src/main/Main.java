package main;

public class Main {
    public static void main(String[] args) throws Exception {
        Barista barista1 = new Barista(1, "나현", 0);
        Barista barista2 = new Barista(2, "예은", 0);

        Customer customer1 = new Customer(3, "준형", 20000);
        Customer customer2 = new Customer(4, "지은", 10000);

        Cashier cashier = new Cashier(5, "하은", 0);

        customer1.orderCoffee(cashier, barista1, Menu.AMERICANO, "hot");
        customer2.orderCoffee(cashier, barista2, Menu.LATTE, "ice");
        customer1.orderCoffee(cashier, barista1, Menu.VANILLALATTE, "hot");
        customer2.orderCoffee(cashier, barista2, Menu.SMOOTHIE, "ice");
        customer2.orderCoffee(cashier, barista2, Menu.ORANGEJUICE, "hot");
    }
}