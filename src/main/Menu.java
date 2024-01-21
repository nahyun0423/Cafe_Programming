package main;

public enum Menu {
    AMERICANO(3000),
    LATTE(3500),
    VANILLALATTE(4000),
    SMOOTHIE(5000),
    ORANGEJUICE(6000);

    private final int price;

    Menu(int price) {
        this.price = price;
    }

    public static int getPrice(Menu menu) {
        return menu.price;
    }

    public static void isHotAvailable(Menu menu) throws Exception {
        if (menu.equals(ORANGEJUICE) || menu.equals(SMOOTHIE)) {
            System.out.println("*해당 메뉴는 ice만 가능합니다.*");
            throw new Exception("*해당 메뉴는 ice만 가능합니다.*");
        }
    }
}
