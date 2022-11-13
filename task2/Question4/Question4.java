package Question4;

public class Question4 {

    // static method
    static String findWord2() {
        String wordTwo = "morning.";
        return wordTwo;
    }

    // non static method
    void printGreeting(String wordA, String word2) {
        System.out.println(wordA + word2);
    }

    // main method
    public static void main(String[] args) {

        String word1, word2;
        // calling a static method
        word1 = "Good ";
        word2 = findWord2();

        // using non-static method
        Question4 myClass = new Question4();
        myClass.printGreeting(word1, word2);
    }

}