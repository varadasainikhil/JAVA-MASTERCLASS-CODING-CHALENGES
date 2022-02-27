public class DeluxeBurger extends Hamburger {
    private int chips;
    private int drinks;

    public DeluxeBurger() {
        super("Deluxe", "sausage and bacon",19.10, "white");
        super.addHamburgerAddition1("chips",0);
        super.addHamburgerAddition2("drinks",0);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
}


