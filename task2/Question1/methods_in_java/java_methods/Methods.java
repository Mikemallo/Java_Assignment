package Question1.methods_in_java.java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        
        //my variables
        double num1;
        double num2;
        double num3;
        double smallNumber;
        double largeNumber;

        // scanner object
        Scanner input = new Scanner(System.in);

        //getting input
        System.out.println("\nEnter the first number: ");
        num1 = input.nextInt(); //get first number
        System.out.println("Enter the second number: ");
        num2 = input.nextInt(); //get second number
        System.out.println("Enter the third number: ");
        num3 = input.nextInt(); //get third number


        smallNumber = findSmallNumber(num1, num2, num3);
        largeNumber = findLargeNumber(num1, num2, num3);

        //output 
        System.out.println("\nThe smallest number: " + smallNumber);
        System.out.println("The largest number: " + largeNumber);
        System.out.println(largeNumber + " is your largest and " + smallNumber + " is the smallest number.");
    }

    // find the smallest num
    static double findSmallNumber(double firstNum, double secondNum, double thirdNum) {

        // get smallest number
        if (firstNum < secondNum) {
            // if true, is firstNum > thirdNum
            if (firstNum < thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            // else false, is secondNum < thirdNum
            if (secondNum < thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }

    // find the largest num
    static double findLargeNumber(double firstNum, double secondNum, double thirdNum) {

        // get largest number
        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            if (secondNum > thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }
}
