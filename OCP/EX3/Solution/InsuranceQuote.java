package OCP.EX3.Solution;

public class InsuranceQuote {
    private final double price;
    private final String details;

    public InsuranceQuote(double price, String details) {
        this.price = price;
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Insurance Quote { Price: " + price + ", Details: '" + details + "' }";
    }
}
