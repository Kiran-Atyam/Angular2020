import java.util.ArrayList;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        for(int i =1; i<=n;i++){
            arr.add(i);
            System.out.println(arr.get(i));
        }
        
    }
    
}
