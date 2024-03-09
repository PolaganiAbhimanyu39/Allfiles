class Animal{
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    
    void eat(){
        System.out.println("eating bread....");
    }
    void bark(){
        System.out.println("barking....");
    }
    void work(){
        super.eat();
        eat();
        bark();
    }
}
public class Super_Demo_2 {
    public static void main(String args[]){
        Dog tom = new Dog();
        tom.work();
    }
}