
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String command;
                
        while (true) {         
            command = scanner.nextLine();
            if(command.equals("end")){
                break;
            }
            number = Integer.valueOf(command);
            System.out.println(number * number * number);
        }
    }
}
