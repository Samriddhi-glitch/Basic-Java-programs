//WAP to detect whether the number entered is an integer or not 

import java.util.Scanner;
public class detection {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
