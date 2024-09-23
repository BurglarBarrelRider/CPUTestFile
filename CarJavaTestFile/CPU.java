


public class Computer {

    private String  Computername;
    private String  OC;
    private int   year;
    private double price;

    public Computer() {  // конструктор дефолт
        this.Computername = "";
        this.OC = "";
        this.year = 0;
        this.price = 0.0;
    }
    public Computer(String Computername, String OC, int year, double price) {
        this.Computername = Computername;
        this.OC = OC;
        this.year = year;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Computer");
        System.out.println("Computername " + this.Computername);
        System.out.println("OC " + this.OC);
        System.out.println("Year " + this.year);
        System.out.println("Price " + this.price);
    }

    public void start() {
        System.out.println(this.Computername + " " + this.OC + " is starting...");
    }

    public void upgradeComputer(String feature, double additionalCost) {
        this.price += additionalCost;
        System.out.println("Computer was modified with " + feature + ". New price equals = " + this.price);
    }

    public static void main(String[] args) {
        Computer Computer1 = new Computer();
        Computer Computer2 = new Computer("Acer", "Windows", 2018, 10000.00);
        Computer Computer3 = new Computer("Asus", "MacOS", 1999, 33000.00);

        Computer1.displayInfo();
        System.out.println();
        Computer2.displayInfo();
        System.out.println();
        Computer3.displayInfo();

        Computer2.displayInfo();
    }
}
