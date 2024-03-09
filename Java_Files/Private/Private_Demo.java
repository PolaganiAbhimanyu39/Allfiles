private class Demo{
    int obj = 40;
    void display(){
        System.out.println("obj is "+obj);
    }
}
public class Private_Demo {
    public static void main(String[] args){
        Demo d = new Demo();
        // below statement will cause an error
        //System.out.println(d.obj);
        //d.display();
    }
}
