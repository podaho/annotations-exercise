/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<String> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<String> ();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        List<String> retVal = books;
        return retVal;
    }

    public List<String> publishedBooks() {
        List<String> retVal = books;
        return retVal;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
