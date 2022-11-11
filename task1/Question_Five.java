package task1;

import java.util.Scanner; //importing Scanner

public class Question_Five {
    public static void main(String[] args) {

        // my variables
        Double firstNum,
                secondNum,
                result;
        char mathSymbol;

        Scanner data = new Scanner(System.in); //Scanner object

        // request the first number from the user
        System.out.println("Enter the first number");
        firstNum = data.nextDouble();

        // request the the mathSymbol from the user
        System.out.println("Choose an mathSymbol: +, -, *, or /");
        mathSymbol = data.next().charAt(0);

        // request the second number from the user
        System.out.println("Enter second number");
        secondNum = data.nextDouble();

        switch (mathSymbol) {

            // perform subtraction
            case '-':
                result = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + result);
                break;

            // perform addition
            case '+':
                result = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + result);
                break;

            // perform multiplication
            case '*':
                result = firstNum * secondNum;
                System.out.println(firstNum + " * " + secondNum + " = " + result);
                break;

            // perform division
            case '/':
                result = firstNum / secondNum;
                System.out.println(firstNum + " / " + secondNum + " = " + result);
                break;

            default:
                System.out.println("Please try again.");
                break;
        }
    }
}
