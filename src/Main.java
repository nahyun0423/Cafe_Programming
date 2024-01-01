public class Main {
    public static void main(String[] args) throws Exception {
        Cashier cashier = new Cashier(1, "나현", 0);
        Guest guest = new Guest(2, "준형", 20000);

        guest.orderCoffee(cashier, Menu.MenuItem.AMERICANO, "hot");
        guest.orderCoffee(cashier, Menu.MenuItem.LATTE, "ice");
        guest.orderCoffee(cashier, Menu.MenuItem.VANILLALATTE, "hot");
        guest.orderCoffee(cashier, Menu.MenuItem.SMOOTHIE, "ice");
        guest.orderCoffee(cashier, Menu.MenuItem.ORANGEJUICE, "hot");
    }
}