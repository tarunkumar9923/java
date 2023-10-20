import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        int a,b,c,max;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value a");
        System.out.println("Enter The value b");
        System.out.println("Enter The value c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println((a>b)? (a >c ? a : c) : (b > c ? b:c));
        




		
    }
}
