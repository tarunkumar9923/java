import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        n = sc.nextInt();
        if(n<1000||n<=5000){
            System.out.println("5% off");
        }
        if(n<=10000){
            System.out.println("10% off");
        }
        if(n<20000){
            System.out.println("15% off");
        }
        if(n>20000){
            System.out.println("25% off");
        }
        
    
}
}
