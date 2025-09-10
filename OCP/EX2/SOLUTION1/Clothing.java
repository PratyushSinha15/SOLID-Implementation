package OCP.EX2.SOLUTION1;

public class Clothing implements Product {
    private String name;
    public Clothing(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return 500.0;
    }
}

