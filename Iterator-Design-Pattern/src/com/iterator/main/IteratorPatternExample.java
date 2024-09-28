package com.iterator.main;

import com.iterator.book.BookCollection;
import com.iterator.entity.Book;
import com.iterator.interfacee.Iterator;

public class IteratorPatternExample {
	
    public static void main(String[] args) {
        // Create a book collection
        BookCollection bookCollection = new BookCollection(5);
        
        // Add books to the collection
        bookCollection.addBook(new Book("Design Patterns", "Erich Gamma"));
        bookCollection.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookCollection.addBook(new Book("Effective Java", "Joshua Bloch"));

        // Get iterator
        Iterator bookIterator = bookCollection.getIterator();

        // Traverse the book collection using the iterator
        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book);
        }
    }
}
