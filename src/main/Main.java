package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner();

        Customer customer1 = new Customer("준형", 20000);
        Customer customer2 = new Customer("지은", 20000);

        Barista barista1 = new Barista("나현", 0);
        Barista barista2 = new Barista("예은", 0);

        Cashier cashier1 = new Cashier("하은", 0, barista1);
        Cashier cashier2 = new Cashier("다은", 0, barista2);

        customer1.orderCoffee(cashier1, Menu.HOT_AMERICANO);
        customer2.orderCoffee(cashier1, Menu.ICE_LATTE);
        customer1.orderCoffee(cashier2, Menu.HOT_VANILLALATTE);
        customer2.orderCoffee(cashier2, Menu.SMOOTHIE);
        customer2.orderCoffee(cashier2, Menu.ORANGEJUICE);

        System.out.println("=====영업 종료======");
        System.out.println("매출 : " + owner.getMoney());
        System.out.println("캐셔 인센티브");
        System.out.println(cashier1.getName() + " :" + owner.giveIncentive(cashier1));
        System.out.println(cashier2.getName() + " :" + owner.giveIncentive(cashier2));
        System.out.println("바리스타 인센티브");
        System.out.println(barista1.getName() + " :" + owner.giveIncentive(barista1));
        System.out.println(barista2.getName() + " :" + owner.giveIncentive(barista2));
    }
}