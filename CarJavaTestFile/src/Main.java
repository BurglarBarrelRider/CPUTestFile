public class Main {


        public static void main(String[] args) {
            Computer Computer1 = new Computer();
            Computer Computer2 = new Computer("Acerr", "Linux", 2018, 10000.00);
            Computer Computer3 = new Computer("Samsung", "Windows 11", 1999, 33000.00);

            Computer1.displayInfo();
            System.out.println();
            Computer2.displayInfo();
            System.out.println();
            Computer3.displayInfo();

            Computer2.displayInfo();
        }
}
