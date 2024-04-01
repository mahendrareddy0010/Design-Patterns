package behavioural.iteratorPattern.iterators;

import behavioural.iteratorPattern.collections.BookList;

public class BookListIterator implements Iterator{
    private BookList bookList;
    private int currentIdx = 0;
    
    public BookListIterator(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public Object next() {
        Object tmp = null;
        if (hasNext()) {
            tmp =  bookList.getBook(currentIdx);
            currentIdx += 1;
        }

        return tmp;
    }

    @Override
    public Boolean hasNext() {
        if (currentIdx >= bookList.getSize()) {
            return false;
        }

        return true;
    }
    
}
