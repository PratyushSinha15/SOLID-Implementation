//package OCP.EX3;
//
//
///*
//This code violates the Open/Closed Principle because the VehicleInsuranceEvaluator is not closed for modification.
// Each time a new vehicle type is introduced, this class must be modified to handle it. Instead,
// we should delegate the insurance logic to each Vehicle (via polymorphism),
// so new vehicles can extend behavior without changing existing evaluator code.
//* */
//
//
//// BAD CODE - Violates OCP
//// Because each time a new Vehicle type is added (e.g., Bike, Bus),
//// we must modify this evaluator class.
//
//class Vehicle {}
//
//class Car extends Vehicle {}
//class Truck extends Vehicle {}
//
//public class InsuranceQuote {
//    private String details;
//
//    public InsuranceQuote(String details) {
//        this.details = details;
//    }
//
//    @Override
//    public String toString() {
//        return details;
//    }
//}
//
//class VehicleInsuranceEvaluator {
//    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
//        if (vehicle instanceof Car) {
//            // Logic for Car insurance
//            return new InsuranceQuote("Car Insurance Calculated");
//        } else if (vehicle instanceof Truck) {
//            // Logic for Truck insurance
//            return new InsuranceQuote("Truck Insurance Calculated");
//        }
//
//        throw new IllegalArgumentException("Unsupported vehicle type.");
//    }
//}
//
//public class ProblemCode2 {
//    public static void main(String[] args) {
//        VehicleInsuranceEvaluator evaluator = new VehicleInsuranceEvaluator();
//
//        Vehicle car = new Car();
//        Vehicle truck = new Truck();
//
//        System.out.println(evaluator.evaluateInsurance(car));
//        System.out.println(evaluator.evaluateInsurance(truck));
//
//        // ❌ If we add Bike tomorrow, we must MODIFY VehicleInsuranceEvaluator
//        // This is an OCP violation.
//    }
//}
//
