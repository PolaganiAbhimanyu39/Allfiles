import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args)
    {
        byte[] cities = {'H','Y','D','E','R','A','B','A','D','\n','M','U','M','B','A','I','\n'};
        FileOutputStream output = null;
        try {
            output = new FileOutputStream("Cities.txt");
            output.write(cities);
            output.close();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Hello");
        }
        catch(IOException ioe)
        {
            System.out.println("Helloi");
        }

    }
}
