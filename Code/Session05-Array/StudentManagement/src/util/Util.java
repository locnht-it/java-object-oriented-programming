
package util;

import java.util.Scanner;


public class Util {
    public static Scanner sc = new Scanner(System.in);
    
    public static int getAnInteger(String inputMsg) {       
        int n;
        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know input an integer?");
            }
        } while(true);
    }
    
    public static double getADouble(String inputMsg) {
        double n;
        do {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know input a real number?");
            }
        } while (true);
    }
    
}
