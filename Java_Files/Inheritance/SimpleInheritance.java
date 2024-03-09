class Point2D{
    int x,y;
    void display(){
        System.out.print("x: "+x+" y: "+y);
        System.out.println();
    }
    
}
class Point3D extends Point2D{
    int z;
    void display(){
        System.out.print("x: "+x+" y: "+y+" z: "+z);
    }
}
class SimpleInheritance{
    public static void main(String args[]){
    Point2D P1 = new  Point2D();
    Point3D P2 = new Point3D();
    P1.x = 5;
    P1.y = 3;
    P2.x = 23;
    P2.y = 44;
    P2.z = 66;
    P1.display();
    P2.display();
    }
}