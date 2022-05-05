import java.util.HashSet;
import java.util.Set;

public class Setex {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        s.add(23);
        s.add(54);
        s.add(87);

        s.forEach(e->System.out.println(e));
    }
    
}
