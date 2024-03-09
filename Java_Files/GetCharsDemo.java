public class GetCharsDemo 
{
    public static void main(String[] args)
    {
        String s = "This is a demo of the getchars method";
        int start = 10;
        int end = 14;
        char[] arr = new char[end-start];
        s.getChars(start,end,arr,0);
        System.out.println(arr);
    }
}
