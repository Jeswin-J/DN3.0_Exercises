import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class SearchFunctions {
    public static Book linearSearch(Book[] books, String searchTitle){

        Book result = null;

        for(Book book : books){
            if(Objects.equals(book.getTitle(), searchTitle)){
                result = book;
            }
        }

        return result;
    }


    public static Book binarySearch(Book[] books, String searchTitle){
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        int left = 0;
        int right = books.length - 1;

        while (left <= right ){
            int mid = (left + right) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(searchTitle);

            if(comparison == 0){
                return books[mid];
            }else if (comparison < 0){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
