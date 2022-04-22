package Basics;
import java.util.Scanner;

public class eligible {
    public static void main(String[] args){
        String s="Arjun";
        System.out.println("Enter the age");
          Scanner sc = new Scanner(System.in);
          int age = sc.nextInt();
          if(age >= 18){
              System.out.println(s+" "+"is Eligible");
          }else{
              System.out.println(s+ " " +"is not eligible" );
          }
        
    }
    
    
}
