import java.util.Scanner;

public class weeks {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        n = sc.nextInt();
        if(n==1){
            System.out.println("MONDAY");
        }
        if(n==2){
            System.out.println("TUESDAY");
        }
        if(n==3){
            System.out.println("WEDNESDAY");
        }
        if(n==4){
            System.out.println("THRUSDAY");
        }
        if(n==5){
            System.out.println("FRIDAY");
        }
        if(n==6){
            System.out.println("SATURDAY");
        }
        if(n==7){
            System.out.println("SUNDAY");
        }
        else{
            System.out.println("INVALID INPUT");
        }
    
}
 
}
