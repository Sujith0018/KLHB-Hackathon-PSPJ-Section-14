import java.util.Scanner;

public class SolarSystem3 {
        public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
            double total = morningEnergy + eveningEnergy;
            return total;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double morningEnergy = sc.nextDouble();
        double eveningEnergy = sc.nextDouble();
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");


        sc.close();
    }
}