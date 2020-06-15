public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadRollType;

    private String additional1Name;
    private double addition1Price;

    private String additional2Name;
    private double addition2Price;

    private String additional3Name;
    private double addition3Price;

    private String additional4Name;
    private double addition4Price;



    public Hamburger(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }


    public void additionHamburger1(String name,double price) {
        this.additional1Name = name;
        this.addition1Price = price;
    }

    public void additionHamburger2(String name,double price) {
        this.additional2Name = name;
        this.addition2Price = price;
    }

    public void additionHamburger3(String name,double price) {
        this.additional3Name = name;
        this.addition3Price = price;
    }

    public void additionHamburger4(String name,double price) {
        this.additional4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll"
                + " price is " + this.price );

        if (additional1Name != null ) {
            hamburgerPrice += addition1Price;
            System.out.println("Added " + this.additional1Name + " for an extra " + this.addition1Price );
        }

        if (additional2Name != null ) {
            hamburgerPrice += addition2Price;
            System.out.println("Added "  + this.additional2Name + " for an extra " + this.addition2Price );
        }

        if (additional3Name != null ) {
            hamburgerPrice += addition3Price;
            System.out.println("Added " + this.additional3Name + " for an extra " + this.addition3Price );
        }

        if (additional4Name != null ) {
            hamburgerPrice += addition4Price;
            System.out.println("Added " + this.additional4Name + " for an extra " + this.addition4Price );
        }

        return hamburgerPrice;
    }
}
