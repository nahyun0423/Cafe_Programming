public class Main {
    public static void main(String[] args) throws Exception {
        Barista barista1 = new Barista(1, "나현", 0);
        Barista barista2 = new Barista(2, "예은", 0);

        Guest guest1 = new Guest(3, "준형", 20000);
        Guest guest2 = new Guest(4, "지은", 10000);

        Cashier cashier = new Cashier(5, "하은", 0);

        guest1.orderCoffee(cashier, barista1, Menu.AMERICANO, "hot");
        guest2.orderCoffee(cashier, barista2, Menu.LATTE, "ice");
        guest1.orderCoffee(cashier, barista1, Menu.VANILLALATTE, "hot");
        guest2.orderCoffee(cashier, barista2, Menu.SMOOTHIE, "ice");
        guest2.orderCoffee(cashier, barista2, Menu.ORANGEJUICE, "hot");
    }
}