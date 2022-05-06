import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(22);
        list.add(-24);
        list.remove(2);
        list.add(2,24);
           for(int e :list){
               if(e % 2 == 0){
                   System.out.println("Even numbers is :"+e);
               }
           } 
           list.stream().filter(e -> (e % 2 == 0)).sorted()
           .collect(Collectors.toMap(e -> e+" Meow", Function.identity()))
           .forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        }
    }
    

