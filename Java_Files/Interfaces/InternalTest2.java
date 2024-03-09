import java.awt.*;
import java.awt.event.*;
import java.io.*;
class InternalTest2 extends Frame
{
    int i=0,rows=0,cols;
    Label l[] = new Label[40];
    String s[][]=new String[10][];
    InternalTest2() throws IOException
    {
        try
        {
            FileReader f=new FileReader("D:\\VS_Code\\Java_Files\\Table.txt");
            BufferedReader br=new BufferedReader(f);
            String currentline;
            while((currentline=br.readLine())!=null)
            {
                rows++;
                s[i++]=currentline.split(",");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        i=0;
        cols=s[i].length;
        setLayout(new GridLayout(rows,cols,1,1));
        for(int j=0;j<rows;j++)
        {
            for(int k=0;k<cols;k++)
            {
                l[i]=new Label(s[j][k]);
                add(l[i]);
                i++;
            }
        }
    }
    public static void main(String ar[]) throws IOException
    {
        InternalTest2 m=new InternalTest2();
        m.setSize(300, 300);
        m.setVisible(true);
        m.addWindowListener(new MWindow());
    }
}
class MWindow extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}