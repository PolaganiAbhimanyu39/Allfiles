class Animal{
    Animal(){
        System.out.println("animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();        //"super()" is used to create parent class constructor.
        System.out.println("dog is created");
    }
}
class Super_Demo_3{
    public static void main(String args[]){
        Dog tom = new Dog();
    }
}