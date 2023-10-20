import java.util.Scanner;

public class season {
    
    public static void main(String[] args) {
       
        // Take the input from the user
       
        
       Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE MONTH");
        String Season=sc.next();
        switch(Season){
            case "JANUARY":
            System.out.println("WINTER");
            break;
            case "FEBURAY":
            System.out.println("WINTER");
            break;
             case "MARCH":
            System.out.println("SUMMER");
            break;
             case "APRIL":
            System.out.println("SUMMER");
            break;
             case "MAY":
            System.out.println("SUMMER");
            break;
             case "JUNE":
            System.out.println("SPRING");
            break;
             case "JULY":
            System.out.println("SPRING");
            break;
             case "AUGUST":
            System.out.println("SPRING");
            break;
             case "SEPTEMBER":
            System.out.println("SUMMER");
            break;  
            case "OCTOBER":
            System.out.println("WINTER");
            break; 
            case "NOVEMBER":
            System.out.println("WINTER");
            break;
             case "DECEMBER":
            System.out.println("WINTER");
            break;
        }
    }
}      