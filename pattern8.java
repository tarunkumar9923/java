public class pattern8 {
    public static void main(String[] args) {
        int n = 5; // size of the triangle

        // print the upper part of the triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // print spaces for the hollow part
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // print stars for the filled part
            }
            System.out.println(); // move to the next line
        }

       
        }
    }
