import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;



public class listex{
    public static List<Integer> convertIntoList(){
        int[] arr = {10,15,20,25,30};
       // ArrayList<Integer[]> list = Arrays.asList(arr);
      List<Integer> list =new ArrayList<>();

      for (int e : arr){
          list.add(e);
      }
      return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);     // 0
        list.add(20);     // 1
        list.add(-23);       // 2
        list.add(35);     //3

        list.remove(2);     // To remove the value(it remove 2nd array)

        list.add(2 , 30);    //it is used to add(replace) the element

        System.out.println(list);   // To print all the values in the list

        System.out.println(list.size());   // To display the size of the arrayList

        System.out.println(list.get(1));  // To display particular value of an Array

        System.out.println(list.contains(20));  //To display the value present or not

        System.out.println(list.indexOf(12));    // To display the location of the value

        System.out.println("1) Elements :-");
        for(int i =0; i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Lambda :-");
        list.forEach(z -> System.out.println(z));

        System.out.println("Enhanced :-");
        list.forEach(System.out::println);

        System.out.println("Iterator :-");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
class c implements Consumer<Integer>{

    @Override
    public void accept(Integer t) {
        // TODO Auto-generated method stub
        System.out.println(t);
    }
    
}