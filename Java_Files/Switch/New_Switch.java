import java.util.Scanner;

class New_Switch{
    public static void main(String args[]){
         String inp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        inp = input.next();
        switch(inp){
            case "Monday","Sunday" ->System.out.println("mana"); // instead of ":" here we used "->"
            case "Tuesday" ->System.out.println("tana"); // throught the switch statement use either ":" or "->"
            case "Wednesday" ->System.out.println("wana"); // If you use "->" you don't need to write "break" in every case
            case "Thursday" ->System.out.println("thana");
            default -> System.out.println("Namaste");
        }
    }
}