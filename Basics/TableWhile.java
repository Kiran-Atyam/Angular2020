import java.util.Scanner;
public class TableWhile {
 public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int number = sc.nextInt();
int i=1;
while(i<number){
System.out.println(number + "*" + i + " = " + number*i);
i++;
}
}
    
}

