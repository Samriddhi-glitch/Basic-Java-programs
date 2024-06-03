// WAP to sum first n even numbers using while loop
public class loops{
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        int i = 0;
        while(i<n){
            sum = sum + (2*i);
            i++;
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
        //First 4 even numbers are - 0, 2, 4, 6

        //Print multiplication table of a given number n.
        int m = 13;
        int j = 1;
        while(j<=10) {
            System.out.printf("%d X %d = %d\n", m, j, m*j);//printf is used for the format of the output
            j++;
        }

        //Print multiplication of table in reverse order.
        int k = 10;
        int a = 10;
        while(a>=1) {
            System.out.printf("%d X %d = %d\n", k, a, k*a);
            a--;
        }

        //WAP to find factorial of a given number using for loops
        // What is a factorial? n * n-1 * n-2 * ...1
        // 5! = 5*4*3*2*1
        int b = 5;
        int factorial = 1;
        for(int x = 1; x<=b; x++){
            factorial *= x;  
        }
        System.out.println(factorial);

        //Repeat 5 using while loop
        int c = 5;
        int d = 5;
        while(d>=5){
            d++;
            System.out.println(c);
        }

        //WAP to calculate the sum of the numbers occuring in the multiplication table of 8
        int add = 0;
        int p = 8;
        for(int l = 1; l<=10; l++){
            System.out.printf("%d X %d = %d\n", p, l, p*l);
            add += p*l;
        }
        System.out.println(add);
    }
}