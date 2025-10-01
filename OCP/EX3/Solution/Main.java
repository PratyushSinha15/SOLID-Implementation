package OCP.EX3.Solution;

public class Main {
    public static void main(String[] args) {
        Vehicle car= new Car("Ferrari", 2020);

        VehicleInsurenceEvaluator ev= new VehicleInsurenceEvaluator();
        System.out.println(ev.evaluateInsurance(car));
    }
}
