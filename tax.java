
import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SALARY");
        n = sc.nextInt();
        if(n<10000){
            System.out.println("No Tax");
        }
        if(n<=10000||n<20000){
            System.out.println("10% Tax");
        }
        if(n<=20000||n<30000){
            System.out.println("15% Tax");
        }
        if(n>=30000){
            System.out.println("25% Tax");
        }
        

    
}
}
