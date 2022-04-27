import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        int students,greatest,lowest,sum;
        double average;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students");
        students = sc.nextInt();
        System.out.println("Enter student marks");
        int[] marks = new int[students];
        for(int i = 0; i< students;i++){
            marks[i] = sc.nextInt();
        }
        greatest = marks[0];
        for(int j=1;j<marks.length;j++){
            if(greatest < marks[j]){
                greatest = marks[j];
            }
        }
        lowest =marks[0];
        for(int k = 1;k<marks.length;k++){
            if(lowest > marks[k]){
                lowest = marks[k];
            }
        }
        sum = 0;
        for (int s : marks){
            sum = sum + s;
        }
        average = sum/students;
        System.out.println("Heighest marks is :"+ greatest);
        System.out.println("Lowest marks is : "+lowest);
        System.out.println("Average marks is :"+average);
    }

    
}
