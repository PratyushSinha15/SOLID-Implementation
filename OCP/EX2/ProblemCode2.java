package OCP.EX2;


/*
This code violates the Open/Closed Principle because the VehicleInsuranceEvaluator is not closed for modification.
 Each time a new vehicle type is introduced, this class must be modified to handle it. Instead,
 we should delegate the insurance logic to each Vehicle (via polymorphism),
 so new vehicles can extend behavior without changing existing evaluator code.
* */
public class ProblemCode2 {
//    class VehicleInsuranceEvaluator {
//
//        public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
//            if (vehicle instanceof Car) {
//                // Logic for car insurance
//                return new InsuranceQuote(/* some parameters for car */);
//            } else if (vehicle instanceof Truck) {
//                // Logic for truck insurance
//                return new InsuranceQuote(/* some parameters for truck */);
//            }
//
//            throw new IllegalArgumentException("Unsupported vehicle type.");
//        }
//    }

}
