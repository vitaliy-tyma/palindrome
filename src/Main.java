import java.util.Scanner;

public class Main {

    private static boolean isPalindrome(String word) {

        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            Character leftLetter = Character.toUpperCase(word.charAt(i));
            Character rightLetter = Character.toUpperCase(word.charAt(length - i - 1));
            if (leftLetter != rightLetter) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        String word = reader.nextLine();

        String word = "Adada";
        System.out.println("test 1 (" + word + ") isPalindrome = " + isPalindrome(word));

        word = "adada";
        System.out.println("test 2 (" + word + ") isPalindrome = " + isPalindrome(word));


    }
}




