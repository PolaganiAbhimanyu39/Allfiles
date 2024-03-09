class Animal{
    String color = "White"; 
}
class Dog extends Animal{
    String color = "Black";
    void Printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Super_Demo_1 {
    public static void main(String args[]){
        Animal ani = new Animal();
        Dog tom = new Dog();
        tom.Printcolor();
    }
}
