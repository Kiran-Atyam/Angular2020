import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Queueex {
    public static void main(String[] args) {
        
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(26);
        q.offer(34);
        q.offer(43);
         
        q.poll();
        System.out.println(q.isEmpty());
        q.forEach(System.out::println);

            
        
    }
    
}
