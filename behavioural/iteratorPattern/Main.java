package behavioural.iteratorPattern;

import behavioural.iteratorPattern.collections.Book;
import behavioural.iteratorPattern.collections.BookList;
import behavioural.iteratorPattern.iterators.Iterator;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        bookList.addBook(new Book("title 1"));
        bookList.addBook(new Book("title 2"));
        bookList.addBook(new Book("title 3"));
        bookList.addBook(new Book("title 4"));

        Iterator bookIterator = bookList.createIterator();
        while (bookIterator.hasNext()) {
            System.out.println((Book)bookIterator.next());
        }
    }
}
