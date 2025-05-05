package com.java8featuresademo.sortingex;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public void getBooksSort() {
		BookDAO bookDAO = new BookDAO();
		List<Book> books = bookDAO.getBooks();
		// Collections.sort(books, new MyComarator());
		Collections.sort(books, (b1, b2) -> b1.getName().compareTo(b2.getName()));
		//books.stream().sorted((b1, b2) -> b2.getPage() - b1.getPage()).forEach(System.out::println);
	}

}
/*
 * class MyComarator implements Comparator<Book>{
 * 
 * @Override public int compare(Book b1, Book b2) { return
 * b2.getPage()-b1.getPage(); }
 * 
 * 
 * }
 */

/*
 * 1)create book pojo class--getter setter parametr construcuto toString
 * 2)create DAO class--getBooks method --add books and return the same books
 * list 3)create service -->getBooksSort -->have to implimet sorting 4)
 * contoller class--> main method
 */