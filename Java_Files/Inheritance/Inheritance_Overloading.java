class A{
    void show(){
        System.out.println("I am in class A");
    }
}
class B extends A{
    void show(String msg){    // If you observe the output both methods are present in Subclass(B). The methods are overloaded not 
        System.out.println(msg); // overridden, because we changed the signature by adding parameter in Subclass.
    }
}
public class Inheritance_Overloading {
    public static void main(String args[]){
        B b = new B();
        b.show("Hi hello there"); //
        b.show();
    }
}
