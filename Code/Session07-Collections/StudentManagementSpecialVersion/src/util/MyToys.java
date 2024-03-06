package util;

import java.util.Scanner;

public class MyToys {

    private static Scanner sc = new Scanner(System.in);

    public static int inputAnInteger(String msg, String errMsg) {
        int x;

        while (true) {
            try {
                System.out.print(msg);
                x = Integer.parseInt(sc.nextLine());
                return x;

            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }

    }

    public static double inputADouble(String msg, String errMsg) {
        double x;

        while (true) {
            try {
                System.out.print(msg);
                x = Double.parseDouble(sc.nextLine());
                return x;

            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }

    }

    public static String inputAString(String msg, String errMsg, int length) {
        String x;
        while (true) {
            System.out.print(msg);
            x = sc.nextLine().trim();
            if (0 < x.length() && x.length() <= length) {
                return x;
            }   
            System.out.println(errMsg);
        }
    }

}
