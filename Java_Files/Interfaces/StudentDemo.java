interface Student
{
    int sno = 1;
    String sname = "ds";
    void show();
}
interface Student1
{
    int m1 = 36;
    int m2 = 56;
    int m3 = 78;
}
public class StudentDemo implements  Student,Student1
{
       public void show()
       {
           System.out.println("Sno = "+sno);
           System.out.println("Sname = "+sname);
           System.out.println("m1 = "+m1);
           System.out.println("m2 = "+m2);
           System.out.println("m3 = "+m3);
           int total = m1+m2+m3;
           float avg = total/3;
           System.out.println("total = "+total);
           System.out.println("avgs = "+avg);
       }
       public static void main(String[] args)
       {
           StudentDemo d = new StudentDemo();
           d.show();
       }
}
