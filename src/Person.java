public class Person {
    private int id;
    private String name;
    private int money;

    public Person(int id, String name, int money) {
        this.id = id;
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

    public int getId() {
        return id;
    }
}
