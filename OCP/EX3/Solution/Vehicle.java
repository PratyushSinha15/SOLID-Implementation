package OCP.EX3.Solution;

public abstract class Vehicle {
    private final String name;

    protected Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Polymorphism ke liye abstract method
    public abstract InsuranceQuote calculateInsurance();
}
