import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book searchResult;
        String searchKey;

        Book[] books = {
                new Book("Cartoons", "Robert"),
                new Book("Comics", "Jeswin"),
                new Book("Harry Potter", "J K Rowling"),
                new Book("Wings of Fire", "Dr. A P J Abdul Kalam")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title to Search: ");
        searchKey = sc.nextLine();
        sc.close();


        System.out.println("\nImplementing Linear Search...");
        searchResult = SearchFunctions.linearSearch(books, searchKey);
        System.out.println(searchResult);

        System.out.println("\nImplementing Binary Search...");
        searchResult = SearchFunctions.binarySearch(books, searchKey);
        System.out.println(searchResult);
    }
}
