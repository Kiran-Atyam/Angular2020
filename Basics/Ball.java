public class Ball {
    String material;
    String colour;
    double price;
    public Ball(String material, String colour, double price){
        this.material=material;
        this.colour=colour;
        this.price=price;
    }
    public void display(){
        System.out.println("Material :"+ this.material+","+"Colour :"+this.colour+" ,"+"Price :"+this.price);

    }
    
}
class Cricket{
    public static void main(String[] args){
    Ball b= new Ball("Leather","Red",230.0);
    b.display();
    }
}
