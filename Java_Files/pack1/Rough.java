//We convert String to int using Integer.parseInt
package Objects;
class Example{
    double i;
    double x = Math.sqrt(i);
}
class Calculator{
    public static void main(String args[]){
        Example c = new Example();
        c.i = Integer.parseInt(args[0]);
        System.out.println("Square root of "+c.i+" is "+c.x);
    }
}
// So, when you run the program with an argument 
// of 25, you set c.i to 25 using 
// Integer.parseInt(args[0]), but c.x has 
// already been initialized with the square root 
// of i, which is still 0.0. Hence, the output 
// is "Square root of 25.0 is 0.0."