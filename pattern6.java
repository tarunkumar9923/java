
//Alll rohmbus shape including reverse and hollow
public class pattern6 {
    public static void main(String[] args) {
        for(int i =0;i<5;i++) {
             for (int j = 0; j <= i; j++)
             {
               System.out.print(" ");
             }

              for (int k = 0; k < 5; k++)
              {
        
                System.out.print("*");
                      System.out.print(" ");
              }
             System.out.println("");
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5; k++) {

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}