
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library System");
        System.out.print("How many books do you want to add? ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= numberOfBooks; i++) {
            System.out.println("\n--- Book " + i + " ---");
            System.out.print("Enter title: ");
            String title = scanner.nextLine();

            System.out.print("Enter author: ");
            String author = scanner.nextLine();

            library.addBook(new Book(title, author));
        }

        library.run();

        scanner.close();
    }
}
