package OCP.EX2.SOLUTION1;

public class Electronics implements Product{
    private String name;
    public Electronics(String name){
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 1000.0;
    }
    @Override
    public String getName() {
        return name;
    }
}
