public class ArrayMultiplication {
    public static void main(String[] args) {
        int[] a = new int [10];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[6]=6;
        a[7]=7;
        a[8]=8;
        a[9]=9;
        a[5]=1;
        int product = 1;
        for(int i : a){
            product=product*i;

        }
        System.out.println("Multiplication of an Array is : "+ product);

    }
    
}
