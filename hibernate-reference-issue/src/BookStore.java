import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class BookStore{

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(mappedBy= "bookStore")
    private Set<Book> books = new HashSet<>();

    public void add(Book book){
        book.setBookStore(this);
        this.books.add(book);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}