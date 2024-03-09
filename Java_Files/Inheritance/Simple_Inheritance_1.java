class A{
    int i,j,k;
    void showij(){
        System.out.print("i is "+i+" and j is "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.print("k is "+k);
    }
    void sum(){
        System.out.print("(i+j+k) is "+(i+j+k));
    }
}
class Simple_Inheritance_1{
    public static void main(String args[]){
        A Superclass = new A();
        B Subclass = new B();
        Superclass.i = 10;
        Superclass.j =20;
        Superclass.showij();
        System.out.println();
        Subclass.i = 15;  // This field is defined in Parent class.
        Subclass.j = 30;  // This field is also defined in Parent class.
        Subclass.k = 45;
        Subclass.showij(); // See that I didn't define this method explicitly in B class.
        System.out.println();
        Subclass.showk();
        System.out.println();
        Subclass.sum();
    }
}