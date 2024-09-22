

public class Car {

    private String  carname;
    private String  model;
    private int year;
    private double price;

    public Car() {  // конструктор дефолт
        this.carname = "";
        this.model = "";
        this.year = 0;
        this.price = 0.0;
    }
    public Car(String carname, String model, int year, double price) {
        this.carname = carname;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Машина");
        System.out.println("carname " + this.carname);
        System.out.println("Model " + this.model);
        System.out.println("Year " + this.year);
        System.out.println("Price " + this.price);
    }

    public void start() {
        System.out.println(this.carname + " " + this.model + " is starting...");
    }

    public void upgradeCar(String feature, double additionalCost) {
        this.price += additionalCost;
        System.out.println("Car was modified with " + feature + ". New price equals = " + this.price);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry", 2018, 10000.00);
        Car car3 = new Car("Shevrole", "Impala", 1999, 33000.00);

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
        System.out.println();
        car3.displayInfo();

        car2.displayInfo();
    }
}

