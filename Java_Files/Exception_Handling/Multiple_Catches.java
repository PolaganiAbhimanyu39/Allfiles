public class Multiple_Catches {
    public static void main(String[] args){
    try{
        int a;int b;
        a = args.length;
        b=a;
        b=b/a;
        int[] arr = {1};
        arr[22] = 99;
    }
// If no cmd-args. are passed this catch block will be executed, in that case another catch block will be bypassed.
    catch(ArithmeticException ex1){
        System.out.println("Exception: "+ex1);
    }
// If cmd args. are passed this catch block will be executed.
    catch(IndexOutOfBoundsException ex2){
        System.out.println("Exception: "+ex2);
    }
// This is the end of try-catch block because there aren't any catch blocks left.
    System.out.println("You reading this means you've successfully reached the end of try-catch block");
}
}
