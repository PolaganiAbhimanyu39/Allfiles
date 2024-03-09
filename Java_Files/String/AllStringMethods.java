public class AllStringMethods {
    public static void main(String[] args)
    {
        String s1 = "Hello everyone";
        String s2 = "namaste";
        char c = s1.charAt(0); //Returns the character at the specified index (position)
        System.out.println(c);
        int a = s1.codePointAt(0); //Returns the Unicode of the character at the specified index
        System.out.println(a);
        int b = s1.compareTo(s2);  //Compares two strings lexicographically
// The compareTo method is used to compare the lexicographical order of the strings s1 and s2.
// The result will be an integer representing the difference between the Unicode values of the characters
// at the first differing position in the two strings.
/*Lexicographical comparison is based on the Unicode values of the characters in the strings
 A negative integer is returned if the calling string is lexicographically less than the specified string.
Zero is returned if the calling string is lexicographically equal to the specified string.
A positive integer is returned if the calling string is lexicographically greater than the specified string.
 */
        System.out.println(b);
        int in = s1.compareToIgnoreCase(s2);   //Compares two strings lexicographically, ignoring case differences
        System.out.println(in);
        String s3 = s1.concat(s2);    // Appends a string to the end of another string
        System.out.println(s3);
        boolean t = s1.contains("Hell"); // Checks whether a string contains a sequence of characters
        System.out.println(t);
        String s4 = "Hello";
        boolean s = s1.contentEquals(s4);   //  Checks whether a string contains the exact same sequence of 
        // characters of the specified CharSequence or StringBuffer
        System.out.println(s);
        String s5 = "Hello everyone";
        boolean n = s1.contentEquals(s5);
        System.out.println(n);
        String s6 = s1.copyValueOf(s1); //Returns a String that represents the characters of the character array
        
    }
    
}
