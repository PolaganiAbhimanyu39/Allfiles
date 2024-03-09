//Bounded wildcard arguements

//Two-dimensional coordinates

class TwoD
{
    int x,y;
    TwoD(int a, int b)
    {
        x=a; 
        y=b;
    }
}
//Three-dimensional coordinates

class ThreeD extends TwoD
{
    int x,y,z;
    ThreeD(int a, int b, int c)
    {
        super(a,b);
        z=c;
    }
}
//Four-dimensional coordinates

class FourD extends ThreeD
{
    int x,y,z,t;
    FourD(int a, int b, int c, int d)
    {
        super(a,b,c);
        t=d;
    }
}

// This class holds an array of coordinate objects.

class Coords<T extends TwoD>
{
    T[] coords;
    Coords(T[] o)
    {
        coords = o;
    }
}

//Demonstrate a bounded wildcard.
public class BoundedWildcard
{  
    static void showXY(Coords<?> c)
    {
        System.out.println("X Y coordinates: ");
        for(int i=0;i<c.coords.length;i++)
        {
            System.out.println(c.coords[i].x+" "+c.coords[i].y);
        }
        System.out.println();
    }  
    static void showXYZ(Coords<? extends ThreeD> c)
    {
        System.out.println("X Y Z coordinates: ");
        for(int i=0;i<c.coords.length;i++)
        {
            System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);
        }
        System.out.println();
    }
static void showAll(Coords<? extends FourD> c)
{
    System.out.println("X Y Z T coordinates: ");
    for(int i=0;i<c.coords.length;i++)
    {
        System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z+" "+c.coords[i].t);
    }
    System.out.println();
}
    public static void main(String[] args)
    {
        TwoD td[] = {
            new TwoD(0,0),
            new TwoD(34,65 ),
            new TwoD(12,5 ),
            new TwoD(1, 4),
        };
        Coords<TwoD> tdlocs = new Coords<TwoD>(td);

        System.out.println("Contents of tdlocs. ");
        showXY(tdlocs); //ok is a TwoD
        //  showXYZ(tdlocs);    Error, not a ThreeD
        //  showAll(tdlocs);    Error, not a FourD

        //Now, create some FourD objects.
        FourD fd[] = {
            new FourD(0,0,2,32),
            new FourD(10,20,29,32),
            new FourD(10,01,32,32),
            new FourD(03,30,12,12),
        };
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        System.out.println("Contents of fdlocs.");
        showXY(fdlocs); //ok is a TwoD
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}