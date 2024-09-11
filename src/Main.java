import io.github.arvicss.laptop.*;
import io.github.arvicss.refrigerator.*;
import io.github.arvicss.smartphonecharger.*;
import io.github.arvicss.target.PowerOutlet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PowerOutlet powerOutlet;

        Laptop laptop = new Laptop();
        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);

        SmartPhoneCharger smartPhoneCharger = new SmartPhoneCharger();
        SmartPhoneChargerAdapter smartPhoneChargerAdapter = new SmartPhoneChargerAdapter(smartPhoneCharger);

        boolean stopper = false;

        do {
            powerOutlet = null;

            System.out.println("\nSelect Device that you want to plug in");
            System.out.println("[1] Laptop");
            System.out.println("[2] Refrigerator");
            System.out.println("[3] Smart Phone Charger");
            System.out.println("[4] Exit");
            System.out.print("Option: ");

            int selectedOption = scanner.nextInt();

            switch(selectedOption) {
                case 1:
                    powerOutlet = laptopAdapter;
                break;
                case 2:
                    powerOutlet = refrigeratorAdapter;
                break;
                case 3:
                    powerOutlet = smartPhoneChargerAdapter;
                break;
                case 4:
                    stopper = true;
                break;
                default:
                    continue;
            }

            if (powerOutlet != null) powerOutlet.plugIn();
        } while(!stopper);

        scanner.close();
    }
}