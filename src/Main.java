public class Main {
    public static void main(String[] args) throws Exception {
        Cashier cashier = new Cashier(1, "나현", 0);
        Guest guest1 = new Guest(2, "준형", 20000);
        Guest guest2 = new Guest(3, "지은", 10000);


        guest1.orderCoffee(cashier, Menu.MenuItem.AMERICANO, "hot");
        guest1.orderCoffee(cashier, Menu.MenuItem.LATTE, "ice");
        guest2.orderCoffee(cashier, Menu.MenuItem.VANILLALATTE, "hot");
        guest2.orderCoffee(cashier, Menu.MenuItem.SMOOTHIE, "ice");
        guest2.orderCoffee(cashier, Menu.MenuItem.ORANGEJUICE, "hot");
    }
}