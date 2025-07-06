package Assignment.Assignment4;

public class Library {
    // Add the missing implementation to this class

    String Address;
    String[] Books = new String[10];
    boolean[] isBookborrowed = new boolean[10];
    int numsOfBooks;
    int realAmountOfBooks;

    Library(String address) {
        Address = address;
        numsOfBooks = 0;
        realAmountOfBooks = 0;
    }

    void addBook(Book book) {
        Books[numsOfBooks++] = book.title;
        realAmountOfBooks++;
    }

    static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    void printAddress() {
        System.out.println(Address);
    }

    void borrowBook(String nameOfBook) {

        int bookIndex = 0;

        for (bookIndex = 0; bookIndex < realAmountOfBooks; bookIndex++) {
            if (Books[bookIndex].equals(nameOfBook)) {
                if (isBookborrowed[bookIndex] == false) {
                    System.out.println("You successfully borrowed " + Books[bookIndex]);
                    isBookborrowed[bookIndex] = true;
                    numsOfBooks--;
                    return;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
            }
        }

        System.out.println("Sorry, this book is not in our catalog.");
        return;
    }

    void printAvailableBooks() {
        if (numsOfBooks == 0) {
            System.out.println("No book in catalog");
            return;
        }

        for (int i = 0; i < realAmountOfBooks; i++) {
            if (isBookborrowed[i] == false) {
                System.out.println(Books[i]);
            }
        }
    }

    void returnBook(String bookName) {
        for (int i = 0; i < realAmountOfBooks; i++) {
            if (bookName.equals(Books[i])) {
                System.out.println("You successfully returned " + Books[i]);
                isBookborrowed[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
