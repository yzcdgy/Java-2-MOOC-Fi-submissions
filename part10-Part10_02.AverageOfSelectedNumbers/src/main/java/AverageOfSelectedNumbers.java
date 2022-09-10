
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
        String command = scanner.nextLine();
        
        if(command.equals("p")){
            double averageOfNums = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0).average().getAsDouble();
            System.out.println("average of numbers: " + averageOfNums);
        }
        if(command.equals("n")){
            double averageOfNums = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();
            System.out.println("average of numbers: " + averageOfNums);
        }
        
    }
}
