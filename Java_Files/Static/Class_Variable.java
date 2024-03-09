public class Class_Variable {
    static int circlecount = 0; // class variable
    public double x, y, r; // instance variables

    public Class_Variable(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        circlecount++;
    }

    public Class_Variable(double r) {
        this(0.0, 0.0, r);
        circlecount++;
    }

    public double circumference() {
        return (2 * 3.14159 * r);
    }

    public double area() {
        return (3.14159 * r * r);
    }

    public static void main(String args[]) {
        Class_Variable c1 = new Class_Variable(6.0);
        Class_Variable c2 = new Class_Variable(7.0);
        Class_Variable c3 = new Class_Variable(3.0, 1.0, 8.0);
        System.out.println("Area of circle is " + c1.area() + ", circumference of circle is " + c1.circumference());
        System.out.println(c1.circlecount+" "+c2.circlecount+" "+c3.circlecount);
        // It is same because it's a class variable.
    }
}

