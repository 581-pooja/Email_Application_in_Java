package EmailApp;

public class EmailApp {
    public static void main(String[] args) {

        Email em1 = new Email("Pooja", "Bhagat");
        System.out.println("-----------------------------------------");
        System.out.println(em1.showInfo());
        System.out.println("-----------------------------------------");
        System.out.println("Alternate Email: " + em1.getAlternateEmail());
        //System.out.println(em1.getMailBoxCapacity());
        System.out.println("-----------------------------------------");

    }
}
