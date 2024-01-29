package main;

public enum Menu {
    ICE_AMERICANO(3000),
    HOT_AMERICANO(2500),

    ICE_LATTE(3500),
    HOT_LATTE(3000),

    ICE_VANILLALATTE(4000),
    HOT_VANILLALATTE(3500),

    SMOOTHIE(5000),
    ORANGEJUICE(6000);

    private final int price;

    Menu(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
