public class  HumanIdentification implements Human {

    @Override
    public void Gender() {
        System.out.println("Male");
        
    }

    @Override
    public void colour() {
      System.out.println("Redish");
        
    }

    @Override
    public void name() {
       System.out.println("Kiran");
        
    }
    @Override
    public void age() {
        System.out.println(23);
    }
    @Override
    public void profission() {
        System.out.println("Software Developer");
        
    }
    public static void main(String[] args) {
        
    
    new HumanIdentification().Gender();
    new  HumanIdentification().colour();
    
        new HumanIdentification().name();
    new HumanIdentification().age();
    new HumanIdentification().profission();
    }

    

   
        
    }  

