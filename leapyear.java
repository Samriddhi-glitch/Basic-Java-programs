//WAP to find whether a year entered by the user is a leap year or not

import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int num = sc.nextInt();

        boolean leapyear = false;

        if(num % 4 == 0){
            if(num % 100 == 0){
                if(num % 400 == 0){
                    leapyear = true;
                }
                else{
                    leapyear = false;
                }
            } else{
                leapyear = true;
            }
        } else {
            leapyear = false;
        }
        if(leapyear){
            System.out.println(num + " is a leap year. ");
        } else {
            System.out.println(num + " is not a leap year. ");
        }
    }
}
