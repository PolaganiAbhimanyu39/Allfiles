public class ThrowDemo {
   static void demoproc(){
        try{
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException exob1){
            System.out.println("Caught: "+exob1);
            throw exob1;
        }
    }
    public static void main(String[] args){
        try{
            demoproc();
        }
        catch(NullPointerException exob2){
            System.out.println("Recaught: "+exob2);
        }
    }
}
