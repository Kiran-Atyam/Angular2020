public class Arrayex {
    public static void main(String[] args) {
        
    
    int[] arr = new int[5];
    Object[] obj = new Object[2];
    obj[0]="Kiran";
    obj[1]=78;
    for(Object ob:obj){
        System.out.println(ob.toString());
        
    }

    arr[0]=12;
    arr[1]=13;
    arr[2]=15;
    arr[3]=20;
    arr[4]=25;
    int sum=1;
    for(int  i :arr){
        sum=sum+i;
    }
    System.out.println("Sum : "+sum);

    }   
}
