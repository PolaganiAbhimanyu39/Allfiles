import java.util.Scanner;

class Switch{
    int ino;
    public static void main(String args[]){
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
        switch(input.nextInt()){
            case 1:{
            System.out.print("Sunday");
            break;
            }
                        case 2:{
            System.out.print("Monday");
            break;}
                        case 3:{
            System.out.print("Tuesday");
                        break;}
                        case 4:{
            System.out.print("Wednesday");
                        break;}
                        case 5:{
            System.out.print("Thursday");
                        break;}
                        case 6:{
            System.out.print("Friday");
                        break;}
                        case 7:{
            System.out.print("Saturday");
                       break; }
                       default:
                       System.out.print("Invalid Choice");
        }

    }
}