package com.iterator.book;

import com.iterator.entity.Book;
import com.iterator.interfacee.IterableCollection;
import com.iterator.interfacee.Iterator;

public class BookCollection implements IterableCollection {
	
	private Book[] books;
	private int index = 0;

	public BookCollection(int size) {
		books = new Book[size];
	}

	public void addBook(Book book) {
		if (index < books.length) {
			books[index++] = book;
		}
	}

	@Override
	public Iterator getIterator() {
		return new BookIterator(books);
	}
}
