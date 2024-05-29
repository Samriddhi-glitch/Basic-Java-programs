//WAP to find out the type of website from the url
// .com -> commercial website
// .org -> organization website
// .in -> Indian website

import java.util.Scanner;

public class websitefind {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian webaite");
        }
    }
}
