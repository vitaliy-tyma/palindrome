//import java.util.Scanner;
/*A palindrome is a word that reads the same backward or forward.
Write a function that checks if a given word is a palindrome.
Character case should be ignored.
public static boolean isPalindrome(String word)
For example, isPalindrome("Deleveled") should return true as character case should be ignored, resulting in "deleveled",
which is a palindrome since it reads the same backward and forward.
https://turing.ly/submit/test_board_palindrome
*/
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




