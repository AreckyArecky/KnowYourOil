package com.knowyouroil;

import java.util.Scanner;


public class MeasureInterface {
    public static void init() {
        while (true) {
            System.out.println("WELCOME TO KNOW-YOUR-OIL APP.");
            System.out.println("YOU WILL KNOW HOW MUCH OIL TO ADD TO MIXTURE OF FUEL - TO FILL UP YOUR LAWNMOWER, CHAINSAW ETC.");
            System.out.println("HOW MUCH FUEL DO YOU HAVE?");
            System.out.print("FUEL IN ML: ");
            Scanner scanner = new Scanner(System.in);
            double fuelAmt = Double.valueOf(scanner.nextLine());
            System.out.println(" ");
            System.out.println("WHAT RATIO DO YOU WANT TO USE?");
            System.out.print(" RATIO IS 1:");
            double ratio = Double.valueOf(scanner.nextLine());
            System.out.println(" ");
            OilAmtCalculator calculator = new OilAmtCalculator();
            double result = calculator.calculate(fuelAmt, ratio);
            System.out.println("YOU SHOULD ADD " + result + "ML TO YOUR FUEL.");

            System.out.println("MEASURE AGAIN? [Y/N]: ");
            String again = scanner.nextLine().toUpperCase();
            if(again.equals("N")){
                System.out.println("THANK YOU AND GOODBYE! :)");
                break;} else{
                System.out.println("OKAY, LET'S TRY AGAIN.");
            }

        }
    }
}
