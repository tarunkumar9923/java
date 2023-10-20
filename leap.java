import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE YEAR");
        n = sc.nextInt();
        if (n % 400 == 0) {
            if (n % 100!= 0) {
                if (n % 4 == 0) {
                    System.out.println("THIS IS LEAP YEAR");

                }
            }

        } else {
            System.out.println("THIS IS NOT A LEAP YEAR");
        }

    }

}
