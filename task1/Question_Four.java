package task1;

//these are my imports
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class Question_Four {

    //the main activity
    public static void main(String[] args) {
        
        //stored 71 -> 150 in variable list71to150; of type integer
        List<Integer> list71to150 = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        list71to150.add(150); //added 150 in it

        System.out.println("Multiples of 3 :");
        //these are the multiples of 3
        for (int i = 0; i <= list71to150.size(); i++) {
            if ((list71to150.get(i)) % 3 == 0) {
                System.out.println(list71to150.get(i));
            }
            
            //if i reaches 79, break the loop
            if (i == 79) {
                break;
            } 
        }
        System.out.println(""); //my empty line

        //Multiples of 2:
        System.out.println("The multiples of 2 :");
        for (int i = 0; i <= list71to150.size(); i++) {
            if ((list71to150.get(i)) % 2 == 0) {
                System.out.println(list71to150.get(i));
            }
            
            if (i == 79) {
                break;
            } 
        }
        System.out.println("");
        
        //Multiples of 7:
        System.out.println("Multiples of 7 :");
        //these are the multiples of 7
        for (int i = 0; i <= list71to150.size(); i++) {
            if ((list71to150.get(i)) % 7 == 0) {
                System.out.println(list71to150.get(i));
            }
            
            if (i == 79) {
                break;
            } 
        }

    }
}
