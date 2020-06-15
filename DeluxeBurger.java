public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", 14.54, "Sausage , bacon", "White");
        super.additionHamburger1("Chips",2.75);
        super.additionHamburger2("Drinks",1.80);

    }

    @Override
    public void additionHamburger1(String name, double price) {
        System.out.println("Cannot added additional items to a healthy Burger");
    }

    @Override
    public void additionHamburger2(String name, double price) {
        System.out.println("Cannot added additional items to a healthy Burger");
    }

    @Override
    public void additionHamburger3(String name, double price) {
        System.out.println("Cannot added additional items to a healthy Burger");
    }

    @Override
    public void additionHamburger4(String name, double price) {
        System.out.println("Cannot added additional items to a healthy Burger");
    }
}
