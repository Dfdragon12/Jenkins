package co.edu.unisabana.usuario.logic;

import co.edu.unisabana.usuario.service.library.model.Book;
import co.edu.unisabana.usuario.service.library.model.CategoryBook;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LibroServicioTest {

    private LibroServicio servicio = new LibroServicio() ;
    private Book book1 = new Book("El señor de los anillos", 1954,"J.R. Tolkien", false, CategoryBook.SOFT_COVER);
    private Book book2 = new Book("El señor de los anillos 2", 1963,"J.R. Tolkien", false, CategoryBook.HARD_COVER);


    @Test
    public void Given_books_ok_When_getBooks_Then_return_list(){
        List<Book> listado = new ArrayList();
        listado.add(book1);
        listado.add(book2);
        assertFalse(listado.isEmpty());
    }

    @Test
    public void Given_no_books_ok_When_getBooks_Then_return_empty(){
        List<Book> listado = new ArrayList();
        assertTrue(listado.isEmpty());
    }

    @Test
    public void Give_Book_name_ok_When_getBook_then_return_book(){
        List<Book> listado = new ArrayList();
        List<Book> resultados = new ArrayList<>();
        listado.add(book1);
        listado.add(book2);
        resultados.add(servicio.getBook("El señor de los anillos"));
        assertEquals(1,resultados.size());
    }
}
