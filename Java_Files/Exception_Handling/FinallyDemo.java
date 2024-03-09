// Demonstrate finally.
public class FinallyDemo {
    // Through an exception out of the method.
    static void procA(){
        try{
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }
        finally{
            
        }
    }
}
