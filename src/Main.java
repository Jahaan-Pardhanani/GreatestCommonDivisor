import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.floor;

public class Main {
    public static double getGCD(int first, int second) {
        ArrayList<Double> firstarray = new ArrayList<>();
        ArrayList<Double> secondarray = new ArrayList<>();

        double GCD = 0;

        for (double i = first + second; i > 0; i--) {
            double firstCD = first / i;
            double secondCD = second / i;

            if (floor(firstCD) == firstCD) {
                firstarray.add(firstCD);
            } else if (floor(secondCD) == secondCD) {
                secondarray.add(secondCD);
            }
        }

        for (Double i : secondarray) {
            if (firstarray.contains(i)) {
                GCD = i;
            }
        }

        return GCD;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0");

        System.out.println("Warning: Put numbers in order for program to work properly.");

        Scanner firstinput = new Scanner(System.in);
        System.out.println("Number 1:");
        String firststring = firstinput.next();
        int first = Integer.parseInt(firststring);

        Scanner secondinput = new Scanner(System.in);
        System.out.println("Number 2:");
        String secondstring = secondinput.next();
        int second = Integer.parseInt(secondstring);

        double GCD = getGCD(first, second);

        System.out.println("GCD: " + df.format(GCD));
    }
}