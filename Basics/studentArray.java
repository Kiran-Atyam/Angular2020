public class studentArray {
    public static void main(String[] args) {
        
    
    int[] s =new int[10] ;
    s[0]=23;
    s[1]=22;

    s[2]=20;
    s[3]=14;
    s[4]=13;
    s[5]=24;
    s[6]=18;
    s[7]=17;
    s[8]=15;
    s[9]=14;
    int smallest = s[0];
    int largest = s[0];
    for(int i=1; i<s.length;i++){
        if(s[i] > largest){
            largest = s[i];
        
        } 
        else if(s[i] < smallest){
            smallest = s[i];


        }
        else if{}
        System.out.println("Smallest Number is :" + smallest );
        System.out.println("Largest Number is : " + largest);
    }
    }

   
    }

