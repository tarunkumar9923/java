import java.util.Scanner;

public class calc {
    
    public static void main(String[] args) {
       
        // Take the input from the user
       
        
       Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER");
        
        //Take the input 
        
        int a= sc.nextInt();
        
        int b=sc.nextInt();
        
        System.out.println("ENTER THE NUMBER \n1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLY\n4.DIVISION");
        int num=sc.nextInt();
        switch(num){
        
            //add two numbers
        
            case 1:
            
            num=a+b;
            System.out.println("YOUR OUTPUT IS:" +num);

           
            break;
        
            //sub two numbers
        
            case 2:
            
            num=a-b;
            System.out.println("YOUR OUTPUT IS:" +num);
            
            break;
        
            //multiply two numbers
        
            case 3:
            
            num=a*b;
            System.out.println("YOUR OUTPUT IS:" +num);

            break;
        
            //div two numbers
        
            case 4:

            num=a/b;
            System.out.println("YOUR OUTPUT IS:" +num);

            break;
        
    

         default:

        System.out.println("YOUR INPUT IS INVALID");

         }
     }
    }
