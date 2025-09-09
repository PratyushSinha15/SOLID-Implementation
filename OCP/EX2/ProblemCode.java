package OCP.EX2;

public class ProblemCode {
    enum ProductType {
        ELECTRONICS,
        GROCERY,
        CLOTHING
    }

    class Product {
        private String name;
        private ProductType type;

        public Product(String name, ProductType type) {
            this.name = name;
            this.type = type;
        }

        public double getPrice() {
            if (type == ProductType.ELECTRONICS) {
                return 1000.0;
            } else if (type == ProductType.GROCERY) {
                return 200.0;
            } else if (type == ProductType.CLOTHING) {
                return 500.0;
            }
            return 0.0;
        }

        public String getName() {
            return name;
        }
    }

}
