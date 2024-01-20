package main;

public class Person {
    private String name;
    private int money;


    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void changeMoney(int moneyToChange) {
        this.money = moneyToChange;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }


}
