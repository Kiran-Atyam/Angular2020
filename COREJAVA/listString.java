import java.util.ArrayList;

public class listString {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
            
            l.add("Kiran");
            l.add("Atyam");
            l.add(1,".");
            System.out.println(l);
            System.out.println(l.contains("kiran"));
            System.out.println(l.size());
            System.out.println("String values");
            for(int i=0;i<l.size();i++){
                System.out.println(l.get(i));

            }
            System.out.println("For Lambda values :");
            l. forEach(z -> System.out.println(z));
}
}