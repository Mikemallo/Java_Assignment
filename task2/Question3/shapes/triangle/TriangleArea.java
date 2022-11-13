package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class TriangleArea {

    static double myBase, myHeight, myArea;

    // input the base and the height
    void baseANDheight() {

        Scanner input = new Scanner(System.in);
        // get inputs
        System.out.println("Enter the base of the triangle: ");
        myBase = input.nextDouble(); // store the input

        System.out.println("Enter the height of the triangle: ");
        myHeight = input.nextDouble(); // store the input

    }

    // find the area of the rectangle
    void findArea() {

        // doing operations
        myArea = 0.5 * myBase * myHeight;
    }

    // method to output area
    void printResults() {

        // output the area
        System.out.println("The area of our triangle is: " + myArea);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static
        TriangleArea myClass = new TriangleArea();

        myClass.baseANDheight();
        myClass.findArea();
        myClass.printResults();

    }
}
