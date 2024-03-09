import java.io.*;
public class FileDemo {
    public static void main(String[] arg) throws IOException
    {
        File myFile = new File("We.txt");
        System.out.println("File name is "+myFile.length()+" it present in "+myFile.getAbsolutePath()+" "+myFile.getParent());
    }
}
