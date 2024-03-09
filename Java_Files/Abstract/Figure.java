// Using abstract methods and classes
abstract class Figure {
    double dim1,dim2;
    Figure(double a, double b)
    {
        dim1 = a;
        dim2 = b;
    }
    // area is now an abstract method.
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double a, double b)
    {
        super(a, b);
    }
    // override area for rectangle
    double area()
    {
        System.out.println("Inside area of rectangle");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b)
    {
        super(a, b);
    }
    // override area for the right triangle
    double area(){
        System.out.println("Inside area for rectangle.");
        return dim1*dim2/2;
    }
}
class Demo1{
    
}