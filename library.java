import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private Scanner scanner;

    public Library() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.print((i + 1) + ". ");
            books.get(i).displayInfo();
        }
    }

    public void borrowBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.get(index).borrowBook();
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.get(index).returnBook();
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public void run() {
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. List books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    listBooks();
                    break;
                case 2:
                    System.out.print("Enter book number to borrow: ");
                    borrowBook(scanner.nextInt() - 1);
                    break;
                case 3:
                    System.out.print("Enter book number to return: ");
                    returnBook(scanner.nextInt() - 1);
                    break;
                case 4:
                    System.out.println("Exiting library system.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
