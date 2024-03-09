public class Protected_Demo extends Protected_demo_1{
    protected void msg(){      //overriden methods must not be more restrictive. So, use public or protected because default is more
    System.out.println("Hello "+super.i);  // restrictive than protective. 
  }
    public static void main(String[] args) {
      Protected_demo_1 r = new Protected_demo_1();
      r.msg();
    }
}
