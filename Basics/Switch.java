import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        switch(number){
            case 85:{
                System.out.println("Fatty");
                break;
            }
            case 65 :{
                System.out.println("Normal");
                break;
            }
            case 50 :{
                System.out.println("Very thin");
                break;
            }
        }
    }
    
}
