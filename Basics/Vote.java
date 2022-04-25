import java.util.Scanner;
public class Vote{
public static void main(String[]args){
System.out.println("Enter the Name  :");
Scanner sc = new Scanner (System.in);
String Name = sc.nextLine();

System.out.println("Enter the Age :");
int Age = sc.nextInt();
if(Age >= 18){
    System.out.println(Name + " is eligible for vote");
}else{
System.out.println(Name + "is not eligible for vote" );
}
}
}