package Basics;
import java.util.Scanner;
public class evenodd {
        public static void main(String[] args){
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is Even");
        } 
        else{
            System.out.println(n + " is odd");
        }
    }
}
    

