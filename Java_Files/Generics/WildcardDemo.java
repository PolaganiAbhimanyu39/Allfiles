//  Use a wildcard.
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

    //  Determine if two averages are the same.
    //  Notice the use of the wildcard.
     boolean sameAvg(Stats<?> ob) //    Here, ? represents that Stats object of any type can be passed
    {                             //instead of '?' if you use 'T' it means that invoking object and parameter object must be of same type. 
        if(average()==ob.average()) return true;
        return false;
    }
}
class WildcardDemo
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

        Float fnums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats<Float> fOb = new Stats<Float>(fnums);
        double x = dOb.average();
        System.out.println("fOb average is "+x);

        //  See which arrays have same average.
        System.out.print("Average of iOb and dOb ");
        if(iOb.sameAvg(dOb))System.out.print("are the same");
        else System.out.println("differ");

        System.out.print("Averages of iOb and fOb ");
        if(iOb.sameAvg(fOb)) System.out.println("are the same");
        else System.out.println("differ");
    }
}