
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        ArrayList<Book> books = new ArrayList<>();
        try {
            books =  Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length > 3)
                    .map(row -> new Book(row[0], Integer.valueOf(row[1]), Integer.valueOf(row[2]), row[3]))
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException ex) {
            Logger.getLogger(BooksFromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }
}
