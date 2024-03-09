class A{
    void show(){
        System.out.println("I am in A");
    }
}
class B extends A{
    void show(){
        System.out.println("I am in B");
    }
}
public class Inheritance_Overriding {
    public static void main(String args[]){
        B b = new B();
        b.show();
    }
}
// Here we overrode the method show() defined in Superclass(A). To achieve overriding the names and type signatures of the two methods
// must be identical.