public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if (healthyExtra1Name!=null){
            hamburgerPrice+=healthyExtra1Price;
            System.out.println(healthyExtra1Name+" was added to the burger for "+healthyExtra1Price);
        }
        if (healthyExtra2Name!=null){
            hamburgerPrice+=healthyExtra2Price;
            System.out.println(healthyExtra2Name+" was added to the burger for "+healthyExtra2Price);
        }
        System.out.println("Total price for your healthy hamburger is "+hamburgerPrice);
        return hamburgerPrice;
    }
}
