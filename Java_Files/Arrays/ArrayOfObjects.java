class Students
{
    int marks;
    String name;
    int standard;
}
class ArrayOfObjects
{
public static void main(String[] args)
{
    Students s1 = new Students();
    s1.marks = 98;
    s1.name = "Gautham";
    s1.standard = 7;
    Students s2 = new Students();
    s2.marks = 100;
    s2.name = "Shiva";
    s2.standard = 3;
    Students s3 = new Students();
    s3.marks = 91;
    s3.name = "Naresh";
    s3.standard = 10;
    Students[] arr = new Students[3];
    arr[0] = s1;
    arr[1] = s2;
    arr[2] = s3;
    for(int i = 0;i<arr.length;i++) System.out.println("Marks: "+arr[i].marks+"\nName: "+arr[i].name+"\nStandard: "+arr[i].standard);
    String[] arg = new String[3];
    arg[0] = s1.name;
    arg[1] = s2.name;
    arg[2] = s3.name;
    for(int i = 0;i<arg.length;i++) System.out.println(arg[i]);
}
}