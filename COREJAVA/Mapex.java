import java.util.HashMap;
import java.util.Map;

public class Mapex {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Map is empty :"+ map.isEmpty());
        map.put("Virat Kohli", 18);
        map.put("Dhoni", 07);
        map.put("ABD", 17);
        System.out.println("Map is EMpty :"+ map.isEmpty());

        System.out.println("Key : Kohli value :"+ map.get("Virat Kohli"));
        System.out.println("Key : Dhoni value :"+ map.get("Dhoni"));

        System.out.println("Key : Virat is there :"+ map.containsKey("Virat"));
        System.out.println("Key : Virat Kohli is there :"+ map.containsKey("Virat Kohli"));

        System.out.println("The value 18 is there :" + map.containsKey(18));
        
        map.remove("Dhoni");
        System.out.println("Key Dhoni is removed.");
    
        map.put("Rohit Sharma", 45);
        System.out.println("Key the value of Rohit Sharma is :"+map.get("Rohit Sharma"));

        map.forEach((k, v) -> {
            System.out.println("Key : " + k + ", value : " + v);
        });
    }
    
}
