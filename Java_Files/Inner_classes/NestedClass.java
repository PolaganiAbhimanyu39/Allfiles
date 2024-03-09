import java.lang.Math;
public class NestedClass{
    static double x=0.0,y=0.0,r;
    NestedClass(double r){
        this.r = r;
    }
    // Following is a nested class
    public static class Point{
        double x,y;
        void display(){
            System.out.println("(x,y): "+"{"+this.x+","+this.y+" ");
        }
        Point(double a, double b){
            this.x = a;
            this.y = b;
        }
    }
        public boolean isInside(Point p){
            double dx = p.x-x;
            double dy = p.y-y;    
            double distance = Math.sqrt((dx*dx)+(dy*dy));
            if (distance<r) return true;
            else return false;
        }
        public static void main(String args[]){
            NestedClass a = new NestedClass(2.0);
            Point pa = new Point(1.0,2.0);
            pa.display();
            System.out.println("is the point (1.0,2.0) inside the circle with radius 2: "+a.isInside(pa));
        }
    }