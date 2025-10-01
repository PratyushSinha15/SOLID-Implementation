package OCP.EX3.Solution;

public class Car extends Vehicle {
    private final int manufactureYear;

    public Car(String name, int manufactureYear) {
        super(name);
        this.manufactureYear = manufactureYear;
    }

    @Override
    public InsuranceQuote calculateInsurance() {
        double base = 1000.0;
        int age = java.time.Year.now().getValue() - manufactureYear;
        double price = base + age * 50;
        String details = "Car Insurance for " + getName() + " (Age: " + age + ")";
        return new InsuranceQuote(price, details);
    }
}
