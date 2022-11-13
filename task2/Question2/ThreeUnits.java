package Question2;

import java.util.Scanner;

public class ThreeUnits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double java, networking, math, average; // my variables

        // getting marks
        
        System.out.println("Enter marks for Java Programming: ");
        java = input.nextInt(); // get java marks
        
        System.out.println("Enter marks for Networking: ");
        networking = input.nextInt(); // get networking marks

        
        System.out.println("Enter marks for Maths: ");
        math = input.nextInt(); // get maths marks
        
        // Getting the average
        average = (java + networking + math) / 3; 

        // output to the console
        System.out.println("\nMarks for Java Programming is: " + java);
        System.out.println("Marks for Networking: " + networking);
        System.out.println("Marks for Maths: " + math);

        // output the average
        System.out.println("\nThe average is: " + average);

    }

}
