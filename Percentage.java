import java.util.Scanner;
public class Percentage {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths marks: ");
        int Maths = sc.nextInt();
        System.out.print("Enter Physics marks: ");
        int Physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int Chemistry = sc.nextInt();
        System.out.print("Enter English marks: ");
        int English = sc.nextInt();
        System.out.print("Enter Geography marks: ");
        int Geography = sc.nextInt();
        System.out.println("The percentage of a student is:");
        float percentage = ((Maths + Physics + Chemistry + English + Geography)/500.0f)*100;
        System.out.println(percentage);
    }
}