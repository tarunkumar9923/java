import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("It Is Vowel");
        } else {
            System.out.println("It Is Consonant");
        }

    }
}