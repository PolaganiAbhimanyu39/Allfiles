
/*In Java, the String class is a special case when it comes to object creation. Unlike most other classes, you don't need to use the new keyword to create a String object because Java has a feature called "String literal" or "String pooling" optimization.

When you create a string using double quotes, like this:

java
Copy code
String str = "Hello";
Java checks if there is already a string with the same value in the string pool (a pool of unique string objects). If such a string exists,
 Java reuses it rather than creating a new one. This behavior is part of the Java language specification to optimize memory usage for 
 commonly used strings.

However, if you explicitly use the new keyword to create a String object, like this:

java
Copy code
String str = new String("Hello");
In this case, a new String object will be created in the heap memory, regardless of whether a similar string exists in the string pool.
So, while it's possible to use new to create a String object, it's generally not recommended unless you have a specific reason to do so.
Using string literals (without new) is the more common and efficient way to create String objects in Java, and it's the approach 
you'll see in most Java code*/
class New_String{
    public static void main(String args[]){
        String s = new String("Hello");
        System.out.println(s);
    }
}