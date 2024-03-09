public class ToString 
{
    double height,breadth,length;
    ToString(double h,double b,double l)
    {
        height = h;
        breadth = b;
        length = l;
    }  
    //  Override toString method of Object class  
    public String toString()
    {
        return "Dimensions are "+length+" by "+breadth+" by "+height+".";
    }
    public static void main(String[] args)
    {
        ToString t1 = new ToString(10,20,30);
        String s = "Box: "+t1; //   concatenate object
        System.out.println(t1);     // toString method will be called
        System.out.println(s);
    }
}