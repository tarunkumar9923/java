import java.util.Scanner;
public class Even {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        a=sc.nextInt();
        System.out.println((a%2==0)? "Even":"odd");
        
        
    }
}