public class NestTry {
    public static void main(String[] args){
        try{
            int a = args.length;
            if(a==0) // When no cmd-line args. are passed due to below line / zero error will occur
            a = a/a;
            try{
                a=a/(a-1); /*  When you've 1 cmd-line args / zero error will occur but the inner try will not catch
 this exception, it is passed on to the outer try block, where it is handled */
                int[] myarr = {1};
/*When you pass>=2 cmd-line args. Index exception will occur & it'll be caught by the inner try block */
                myarr[55]=33;
            }
            catch(IndexOutOfBoundsException exob2){
                System.out.println("Exception: "+exob2);
            }
        }
        catch(ArithmeticException exob1){
            System.out.println("Exception: "+exob1);
        }
    }
}