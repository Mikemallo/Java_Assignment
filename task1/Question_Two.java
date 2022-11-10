package task1;

//importting Scanner
import java.util.Scanner;

public class Question_Two {
    
    //main function
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
            
        double unit_one, unit_two, unit_three, unit_four, unit_five, average;
        
            System.out.println("Enter marks of the five units you did on last semester.");
            System.out.println("Unit 1 : ");
            unit_one = data.nextDouble();//getting unit1
            System.out.println("Unit 2 : ");
            unit_two = data.nextDouble();//getting unit2
            System.out.println("Unit 3 : ");
            unit_three = data.nextDouble();//getting unit3
            System.out.println("Unit 4 : ");
            unit_four = data.nextDouble();//getting unit4
            System.out.println("Unit 5 : ");
            unit_five = data.nextDouble();//getting unit5

            //getting average mark by calling getMyAverage() and putting it in a variable
            average = getMyAverage(unit_one, unit_two, unit_three, unit_four, unit_five);

            //Outputting the average
            System.out.println("Average: " + average);
        }

        //a function to get average
    static double getMyAverage(double unit1, double unit2, double unit3, double unit4, double unit5) {
        //finding the average
        double myAverage, roundedAverage;
        
        myAverage = (unit1 + unit2 + unit3 + unit4 + unit5) / 5; 
        roundedAverage = Math.round(myAverage * 100.0) / 100.0; //rounding the average
        return roundedAverage;
    }
}
