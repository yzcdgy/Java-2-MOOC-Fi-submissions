
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            int var = Integer.valueOf(scanner.nextLine());
            if (var == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (var < 0) {
                continue;
            }
            sum += var;
            counter++;
        }
        System.out.println((double) sum / counter);
    }
}
