import java.io.*;
public class FileInputStreamDemo {
    public static void main(String[] arg) throws FileNotFoundException,IOException
    { // FileInputStream is a byte stream class
        FileInputStream fis = new FileInputStream("D:/VS_Code/Java_Files/We.txt.txt");
        int size = fis.available();// this method returns the no.of bytes in that aren't read.
        for(int i = 0;i<(size/4);i++)
        {
            System.out.print((char)fis.read()); // this method reads one character at a time in byte format, so we cast it to char.
        }
        System.out.println();
        System.out.println("Remaining bytes: "+fis.available());
        byte[] b = new byte[size/4];
        if(fis.read(b)!=b.length) // read() method returns the no.of bytes it has read.
        {
            System.out.println("!File read error!");
        }
        else
        {
            String str = new String(b,0,b.length); // parameters are (array variable,start,end) all the characters in between start and end(both inclusive) are converted to string.
            System.out.println(str);
            System.out.println("Skipping size/4 bytes: "+fis.available());
            fis.skip(size/4); // skip() method will skip 'n' bytes.
            System.out.println("Remaining bytes are: "+fis.available());
        }
        fis.close();
    }
}
