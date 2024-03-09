import java.util.Scanner;

public class Switch_Ver_1 {
    public static void main(String args[]){
        String str;
        System.out.print("Enter any text: ");
        Scanner input = new Scanner(System.in);
        String res = "";
        str = input.next();
        res = switch(str) {
            case "A" -> "B"; // no need to write "return".
            case "B" -> "B";
            case "C" -> "B";
            case "D" -> "B";
            default -> "Z";
        };    // Always remember when using switch like an expression keep ";" at the end.
        System.out.println(res);
    }
}
