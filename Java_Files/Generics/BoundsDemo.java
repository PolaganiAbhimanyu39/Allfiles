// In this version of Stats, the type arguement for
// T must be either Number, or a class derived
// from Number.
class Stats<T extends Number>
{
    T[] nums;   //  array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass.
    Stats(T[] o)
    {
        nums = o;
    }
    //  Return type double in all cases
    double average()
    {
        double sum = 0.0;
        for(int i = 0;i<nums.length;i++)
        {
            sum += nums[i].doubleValue(); //all methods defined in Number class will be available
        }
        return sum/nums.length;
    }
}
//  Demonstrate Stats.
class BoundsDemo
{
    public static void main(String[] arg)
    {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("iOb average is "+v);
        
        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is "+w);

        // This won't compile coz String is not 
        // a subclass of Number.
    // String strs[] = {"1","2","3","4","5"};
    // Stats<String> strob = new Stats<String>(strs);

    // double x = strob.average();
    // System.out.println("strob average is "+v);

/* If you run the above code an error will be generated coz Strin is not a subclass of Number.*/
    }
}