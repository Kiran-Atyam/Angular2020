import java.util.Scanner;

import javax.tools.ForwardingFileObject;
public class Car {
    String brandName;
    String model;
    String colour;
    double price;
    double millage;
    public Car(String brandName, String model, String colour, double price, double millage) {
        this.brandName = brandName;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.millage = millage;
    }
    @Override
    public String toString() {
        return "Car [brandName=" + brandName + ", colour=" + colour + ", millage=" + millage + ", model=" + model
                + ", price=" + price + "]";
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getMillage() {
        return millage;
    }
    public void setMillage(double millage) {
        this.millage = millage;
    }
    
}
class Carex{
    static Scanner s = new Scanner(System.in);
    public static Car addCar() {
        Scanner sc = new Scanner(System.in);
    
        
        System.out.println("Enter Car brandName");
        String brandName = sc.nextLine();
    
        String model = sc.nextLine();
        System.out.println("Enter Car colour");
        String colour = sc.nextLine();
        System.out.println("Enter Car price");
        double price = sc.nextDouble();
        System.out.println("Enter Car millage");
        double millage = sc.nextDouble();
        Car C = new Car(brandName, model, colour, price, millage);
        System.out.println("Customer likes the Car");
        System.out.println(C);
        return C;

    }
    public static void main(String[] args) {
        while(true){
            System.out.println("1. If customer like's  the car then explain details of the Car");
            System.out.println("2. exit the program");
            System.out.println("Enter the choice ->");
            int choice = s.nextInt();
            switch(choice){
                case 1:
                addCar();
                break;
                case 2:
                System.out.println("  Have a Nice day!");
             System.exit(0);
                 break;
            }
        }
    }
}
