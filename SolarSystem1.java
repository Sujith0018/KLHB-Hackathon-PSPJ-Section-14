import java.util.Scanner;

public class SolarSystem1{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int panelId = sc.nextInt();                  
        double energyGenerated = sc.nextDouble();    
        int numberOfPanels = sc.nextInt();           
        char systemStatus = sc.next().charAt(0);


        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        sc.close();   // Close the Scanner
    }
}


