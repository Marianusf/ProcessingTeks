package ReadingTeks;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Sentences and press Enter");
        String sentence= scanner.nextLine();

        String[]tokens=sentence.split(" ");
        System.out.printf("number of elements : %d\nThe tokens are:\n", tokens.length);
        for(String token:tokens)
            System.out.println(token);
    }
}
