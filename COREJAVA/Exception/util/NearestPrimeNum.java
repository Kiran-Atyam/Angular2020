package Exception.util;

import java.util.Scanner;

public class NearestPrimeNum {

   public static boolean isPrime(int n){
       for (int i = 2 ; i<n ;i++){
           if (n % i ==0){
               return false;
           }
       }
    return true;
       
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int nearestPrimeNum;
       int n =sc.nextInt();

       if(isPrime(n)){
           System.out.println(n+" itself it is a Prime Number");
       }
       else{
        // n=16
        // 0 - 16 && 16 - ....
        // 13 && 17
        // nearest = 17
        // n - 0
           int smallestPrime =-1;
           int bigPrime = -1;

           //checking for (0-n) numbers 
           for (int i =n;i>0;i--){
               if(isPrime(i)){
                   smallestPrime=i;
                   break;

               }
           }
           int count = n+1;
           while(true){
               if(isPrime(count)){
                   bigPrime=count;
                   break;
               }
               count++;
            }
               //bigPrime-n
               //n-smallPrime

               int step1=bigPrime-n;
               int step2=n-smallestPrime;

               if(step1<step2){
                   nearestPrimeNum=bigPrime;
               }
               else{
                   nearestPrimeNum=smallestPrime;
               }
               System.out.println("Nearest prime number of "+ n +" is "+nearestPrimeNum);

           }
           sc.close();

       }

   }
    

