// In a class hierarchy, constructors are called in order of derivation, from superclass to subclass, even if super() is not used then the
//default or parameterless constructor of each superclass will be executed.
class A{
    A(){
        System.out.println("This is A's constructor");
    }
}
class B extends A{
    B(){
        System.out.println("This is B's constructor");
    }
}
class C extends B{
    C(){
        System.out.println("This is C's constructor");
    }
}
public class Inheritance_Constructor {
    public static void main(String args[]){
        C c = new C();
        
    }
}
