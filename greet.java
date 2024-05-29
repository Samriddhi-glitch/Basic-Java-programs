//WAP which asks the user to enter his/her name and greets them with "Hello<name>, have a good day" text
import java.util.Scanner;
public class greet {
    public static void main(String[] args){
        System.out.println("What is your name?");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day");
    }
}
