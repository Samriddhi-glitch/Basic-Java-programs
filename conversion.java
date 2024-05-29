//WAP to convert kilometer to miles
import java.util.Scanner;
public class conversion {
    public static void main(String[] args){
        System.out.print("Enter a number in kilometer: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float conversion = (float) (a/1.609);
        System.out.println(conversion + " miles");
    }
}
