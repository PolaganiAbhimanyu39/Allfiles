class Circle{
    double x,y;
    double r;
    Circle(double x, double y, double r){
        this.x=x; this.y=y; this.r=r;
    }
    Circle(double r){
        x=0; y=0; this.r=r;
    }
    Circle(Circle c){
        x=c.x; y=c.y; r=c.r;
    }
    Circle(){
        x=0.0; y=0.0; r=1.0;
    }
        return ((22/7)*r*r);
    }
}
class Constructor_Overloading{
    public static  void main(String args[]){
        Circle c1 = new Circle(3.0,4.0,5.0);
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(c1);
        Circle c4 = new Circle();
        System.out.println("area of Circle 1 is "+c1.area());
        System.out.println("area of Circle 2 is "+c2.area());
        System.out.println("area of Circle 3 is "+c3.area());
        System.out.println("area of Circle 4 is "+c4.area());
    }
}