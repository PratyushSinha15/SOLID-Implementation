package OCP.EX2.SOLUTION1;

public class Grocerry implements Product {
    private String name;
    public Grocerry(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return 200.0;
    }
}
