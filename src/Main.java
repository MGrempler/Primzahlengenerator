import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the prime number calculator.");
        System.out.println("Please enter the number you want to start from.");
        Scanner scannerI = new Scanner(System.in);
        String AnswerI = scannerI.nextLine();
        int startNumber = Integer.valueOf(AnswerI);

        System.out.println("Alright now enter the number I should end with.");
        Scanner scannerII = new Scanner(System.in);
        String AnswerII = scannerII.nextLine();
        int endNumber = Integer.valueOf(AnswerII);

        if(startNumber == 0) {
            startNumber = startNumber + 1;
        }
        if(startNumber <= 1) {
            System.out.println(1);
        }
        if(startNumber == 1) {
            startNumber = startNumber + 1;
        }
        if(startNumber < 2) {
            System.out.println(2);
        }
        if(startNumber == 2) {
            System.out.println(2);
        }
        if(endNumber == 3 || startNumber == 3 || !(startNumber > 3)) {
            System.out.println(3);
        }
        if(startNumber <= 4) {
            if(endNumber > 4) {
                System.out.println(5);
            }
        }

        for(int i = startNumber; i < endNumber; i++) {

            if(i % 2 != 0) {
                if(i % 3 != 0) {
                    if(i % 5 != 0 ) {
                            System.out.println(i);
                    }
                }
            }
        }
    }
}