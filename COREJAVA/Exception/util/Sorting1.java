package Exception.util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import  java.util.List;
class Sorting1{
    public static String sort(String str){
        
        List<Integer> list = new ArrayList();
        for(int i =0; i <str.length();i++){
            int n = str.charAt(i); //ASCII
            list.add(n);
        }
        Collections.sort(list);
        String newstr = "";
        for (int i: list){
            newstr += (char) i;
            
             
        }
        return newstr;
    }
public static void main(String[] args) {
    System.out.println("Kiran");
}

}
    
    
    

