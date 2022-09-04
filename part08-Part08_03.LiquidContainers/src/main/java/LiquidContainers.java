
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0;
        int container2 = 0;


        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            if(parts[0].equals("add")){
                if(Integer.valueOf(parts[1]) < 0){
                    continue;
                }
                container1 += Integer.valueOf(parts[1]);
                if (container1 > 100){
                    container1 = 100;
                }
            }
            
            if(parts[0].equals("move")){
                if(container1 >= Integer.valueOf(parts[1])){
                    container2 += Integer.valueOf(parts[1]);
                    container1 -= Integer.valueOf(parts[1]);
                }
                else if(Integer.valueOf(parts[1]) > container1){
                    container2 += container1;
                    container1 = 0;
                }
                if(container2 > 100){
                    container2 = 100;
                }  
            }
            
            if(parts[0].equals("remove")){
                if(container2 > Integer.valueOf(parts[1])){
                    container2 -= Integer.valueOf(parts[1]);
                }
                else if(container2 < Integer.valueOf(parts[1])){
                    container2 = 0;
                }
            }

        }
    }

}
