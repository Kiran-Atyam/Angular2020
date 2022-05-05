import java.util.Scanner;

public class StrArr {
    static String studentName;
    static int num;
    private static String roll_no;
    private static String name;
    private int length;
    
    public StrArr(String studentName, int num) {
       this. studentName = studentName;
        this.num = num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students :");
        int n = sc.nextInt();
        StrArr[] s =new StrArr[n];
        StrArr arr = new StrArr(studentName, num);
        for (int i = 0; i < arr.length; i++){
        System.out.println("Element at " + i + " : " +
                    s[i].roll_no +" "+ s[i].name);
}

        System.out.println();
    }
    
}
