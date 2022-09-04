
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.println("First: " + cont1);
            System.out.println("Second: " + cont2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts[0].equals("add")) {
                cont1.add(Integer.valueOf(parts[1]));
            }

            if (parts[0].equals("move")) {
                if (cont1.contains() < Integer.valueOf(parts[1])) {
                    cont2.add(cont1.contains());
                    cont1.remove(Integer.valueOf(parts[1]));               
                    continue;
                }
                cont1.remove(Integer.valueOf(parts[1]));
                cont2.add(Integer.valueOf(parts[1]));
            }
            if (parts[0].equals("remove")) {
                cont2.remove(Integer.valueOf(parts[1]));
            }
        }
    }

}
