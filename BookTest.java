import com.example.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testGetTitle() {
        Book b = new Book("Jenkins CI Test");
        assertEquals("Jenkins CI Test", b.getTitle());
    }
}
