import java.util.Scanner;

public class traffic {

    public static void main(String[] args) {

        // Take the input from the user

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE LIGHT");
        String light = sc.next();
        switch (light) {
            case "red":
                System.out.println("red->green->yellow");
                break;
            case "yellow":
                System.out.println("yellow->red->green");
                break;
            case "green":
                System.out.println("green->red->yellow");
                break;
        }

    }
}