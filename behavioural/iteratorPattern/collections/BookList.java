package behavioural.iteratorPattern.collections;

import java.util.ArrayList;
import java.util.List;

import behavioural.iteratorPattern.iterators.BookListIterator;
import behavioural.iteratorPattern.iterators.Iterator;

public class BookList {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book getBook(int idx) {
        if (idx >= bookList.size()) {
            return null;
        }
        return bookList.get(idx);
    }

    public int getSize() {
        return bookList.size();
    }

    public Iterator createIterator() {
        return new BookListIterator(this);
    }
}
