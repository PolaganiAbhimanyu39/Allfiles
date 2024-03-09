// Returning an object
class Test{
    int a;
    Test(int i){
        a = i; 
    }
    Test incrbyTen(){
        Test temp = new Test(a+10);
        return temp;
// Reference to new object is returned to caller.
    }
}
public class ReturnObject {
    public static void main(String args[]){
        Test ob1 = new Test(2);
        Test ob2;
        ob2 = ob1.incrbyTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
        ob2 = ob2.incrbyTen();
        System.out.println("ob2.a after second increase: "+ob2.a);
    }
}
