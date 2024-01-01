public class Menu {
    private static final int AMERICANO_PRICE = 3000;
    private static final int LATTE_PRICE = 3500;
    private static final int VANILLALATTE_PRICE = 4000;
    private static final int SMOOTHIE_PRICE = 5000;
    private static final int ORANGEJUICE_PRICE = 6000;


    public enum MenuItem {
        AMERICANO,
        LATTE,
        VANILLALATTE,
        SMOOTHIE,
        ORANGEJUICE
    }

    public static int getPrice(MenuItem menuItem) {
        switch (menuItem) {
            case AMERICANO:
                return AMERICANO_PRICE;
            case LATTE:
                return LATTE_PRICE;
            case VANILLALATTE:
                return VANILLALATTE_PRICE;
            case SMOOTHIE:
                return SMOOTHIE_PRICE;
            case ORANGEJUICE:
                return ORANGEJUICE_PRICE;
            default:
                throw new IllegalArgumentException("잘못된 메뉴 입력");
        }
    }
}
