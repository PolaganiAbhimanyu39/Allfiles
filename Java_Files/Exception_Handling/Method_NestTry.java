/* Try statements can be implicitly nested via calls to methods */
public class Method_NestTry {
    static void nesttry(int a){
        try{ // this is a nested try block to try in main method.
            /* If 1 cmd-line args. is used divide by 0 error will occur */
            if(a==1) a=a/(a-a);  // division by zero.
        /* If 2 cmd-line args. are passed then out-of-bounds exception will occur */
        if(a==2){
            int[] c = {1};
            c[12]=99; // generates an out-of-bounds exception.
        }
    } // end ot inner-try block
    catch(ArrayIndexOutOfBoundsException exob1){
        System.out.println("Exception: "+exob1);
    }
}
public static void main(String[] args){
    try{
        int a = args.length;
        /* If no cmd-line args. are passed the following statemnet will generate a divide-by-zero exception. */
        int b = 33/a;
        System.out.println("a = "+a);
        nesttry(a);
    }
    catch(ArithmeticException exob2){
        System.out.println("Divide by 0: "+exob2);
    }
  }
}
