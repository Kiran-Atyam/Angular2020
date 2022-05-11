package Exception.util;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

public static int factorial(int n) {
       
         int factorial = 1;
         for(int i = 1;i<=n;i++){
             factorial = factorial*i;
         }
        return factorial;

}
    }
    


