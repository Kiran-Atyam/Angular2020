import java.util.Stack;

public class Stackex {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(52);
        s.push(55);
        s.pop();

        System.out.println(s.isEmpty());

       s.forEach(System.out::println);
    }
    
}
