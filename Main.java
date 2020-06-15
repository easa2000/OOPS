public class Main {
    public static void main(String [] args) {
        Hamburger hamburger = new Hamburger("Basic",3.56,"Sausage","White");

        hamburger.additionHamburger1("Tomato",0.27);
        hamburger.additionHamburger2("lettuce",0.75);
        hamburger.additionHamburger3("Cheese",1.12);

        System.out.println("Total Burger Price is " + hamburger.itemizeHamburger() + " \n\n");

        HealthyBurger healthyBurger = new HealthyBurger(5.67,"Bacon");
        healthyBurger.addHealthAddition1("Egg",10);
        healthyBurger.addHealthAddition2("Lentils",5);
        System.out.println("Total HealthyBurger price is " + healthyBurger.itemizeHamburger() + " \n\n" );

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total DeluxeBurger price is " + deluxeBurger.itemizeHamburger());



    }
}
