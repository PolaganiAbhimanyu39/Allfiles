class A
{
    @Override
    public String toString() {
        return "A [model=" + model + ", price=" + price + "]";
    }
    String model;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}
public class ObjectClass {
    public static void main(String[] args){
    A a = new A();
    A b = new A();
    a.model = "Dell Alienware";
    a.price = 1299;
    b.model = "Dell Alienware";
    b.price = 1299;a.
    System.out.println(a);  // by default, when you print the reference variable .toString() is called. See, that both outputs are same.
    System.out.println(a.hashCode());   // what you get after @ is a hexadecimal number equivalent to this line output(convert from decimal to hexdec).
    System.out.println(a.toString());
    System.out.println(a.equals(b)); // this method is used to check if two objects have same content.
}
}
