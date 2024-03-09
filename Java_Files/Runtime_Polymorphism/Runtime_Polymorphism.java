class Bike{
    void run(){
        System.out.println("running");
    }
}
class CT100 extends Bike{
    void run(){
        System.out.println("running for the last 70km");
    }
}
public class Runtime_Polymorphism {
    public static void main(String args[]){
    CT100 b1 = new CT100();
    b1.run();
    Bike b2 = new Bike();
    b2.run();
    Bike b3 = new CT100();    // "b3" is Bike-class reference variable but it actually points to CT100.
    b3.run();
    }
}
