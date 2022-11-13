package Question3.leap_year;

import java.util.Scanner;

public class LeapYear {

    // the method to find leap year
    static void leapYear() {
        int year;
        // scanner object
        Scanner input = new Scanner(System.in);

        // inou the year
        System.out.println("Enter year :");

        year = input.nextInt();

        // if its modulus with 4 is 0; then it is leap
        if ((year % 4) == 0) {
            // then it is a leap year
            System.out.println(year + " is a leap year");
        } else {
            // then it is not a leap year
            System.out.println(year + " is not a leap year");
        }

    }

    // main method
    public static void main(String[] args) {

        // calling the method
        leapYear();
    }
}
