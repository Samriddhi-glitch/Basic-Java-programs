//WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade

public class encrypt {
    public static void main(String[] args) {
        //encrypting
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade); 

        //decrypting
        grade = (char)(grade - 8);
        System.out.println(grade); 
    }
}
