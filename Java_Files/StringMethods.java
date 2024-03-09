public class StringMethods 
{
    public static void main(String[] arg)
    {
        String s = "Hello";
        String s1 = "Namaste";
        String s2 = "hELLO";
        String s3 = "Helsinki";
        String s4 = "sink";
        String s5 = new String(s4);
        System.out.println("s4 is "+s4+"   s5 is "+s5);
        boolean b = s.equals(s1);
        boolean b1 = s.equalsIgnoreCase(s2);
        System.out.println(b+" "+b1);
       boolean b3 = s3.regionMatches(3, s4, 0, 4); //(boolean ignorecase, int startindex, String str2, int str2startindex, int numchars)
       System.out.println(b3);
       boolean b4 = "Namaste".startsWith("Nam");
       boolean b5 = "Hello".endsWith("llo");
       System.out.println(b4+" "+b5);
    }
}
