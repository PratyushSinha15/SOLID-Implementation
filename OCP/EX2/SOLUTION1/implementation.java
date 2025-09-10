package OCP.EX2.SOLUTION1;

public class implementation {
    public static void main(String[] args) {
        Product laptop= new Electronics("Laptop");
        Product dhoti= new Clothing("Dhoti");
        Product sabji= new Grocerry("Sabji");

        System.out.println("Product Name: "+ laptop.getName()+ "Price: "+ laptop.getPrice());
        System.out.println("Product Name: "+ dhoti.getName()+ "Price: "+ dhoti.getPrice());
        System.out.println("Product Name: "+ sabji.getName()+ "Price: "+ sabji.getPrice());
    }
}
