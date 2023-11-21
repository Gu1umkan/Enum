package homeWork;

public class Main {
    public static void main(String[] args) {
        double dictance = 100;
        for (TransportType transport:TransportType.values()) {
            System.out.println("**********************************************");
            System.out.println(transport.name() +" 1 км үчүн баасы $ "+transport.getTariffFare());
            System.out.println(transport.name()+" "+dictance+" км үчүн баасы $"+transport.calculateTravelCost(dictance));
        }
    }
}
