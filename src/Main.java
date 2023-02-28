import java.util.Scanner; // Hallo

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

        if (startNumber < endNumber) {
            if (startNumber == 0) {
                startNumber = startNumber + 1;
            }
            if (startNumber == 1) {
                startNumber = startNumber + 1;
            }

            for (int i = startNumber; i < endNumber; i++) {
                boolean isprime = true;
                for (int j = 2; j < i - 1; j++) {
                    if (i % j == 0) {
                        isprime = false;
                    }
                }
                if (isprime) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Sorry the startnumber can`t be higher than the endnumber. ");
        }
    }
}