public class Multiple_Classes{
    public static void main(String[] args){
        Circle c=new Circle();
        c.x=5.0;
        c.y=6.0;
        c.r=3.0;
        System.out.println("Circumference of circle is "+c.circumference()+" and area of circle is "+c.area());
        Box b=new Box();
        b.depth=5.0;
        b.height=3.0;
        b.width=7.0;
        System.out.println("Area of the box is "+b.volume());

    }
}
