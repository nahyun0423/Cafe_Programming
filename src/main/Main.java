package main;

public class Main {
    public static void main(String[] args) throws Exception {
        Owner owner = new Owner();

        Barista barista1 = new Barista("나현", 0);
        Barista barista2 = new Barista("예은", 0);

        Customer customer1 = new Customer("준형", 20000);
        Customer customer2 = new Customer("지은", 20000);

        Cashier cashier1 = new Cashier("하은", 0);
        Cashier cashier2 = new Cashier("다은", 0);

        customer1.orderCoffee(barista1, cashier1, Menu.AMERICANO, "hot");
        customer2.orderCoffee(barista2, cashier1, Menu.LATTE, "ice");
        customer1.orderCoffee(barista2, cashier2, Menu.VANILLALATTE, "hot");
        customer2.orderCoffee(barista1, cashier2, Menu.SMOOTHIE, "ice");
        customer2.orderCoffee(barista1, cashier2, Menu.ORANGEJUICE, "ice");

        System.out.println("=====영업 종료======");
        System.out.println("매출 : " + owner.getMoney());
        System.out.println("캐셔 인센티브");
        System.out.println(cashier1.getName() + " :" + cashier1.getMoney());
        System.out.println(cashier2.getName() + " :" + cashier2.getMoney());
        System.out.println("바리스타 인센티브");
        System.out.println(barista1.getName() + " :" + barista1.getMoney());
        System.out.println(barista2.getName() + " :" + barista2.getMoney());

    }
}