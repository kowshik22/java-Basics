package com.Collection;

import java.util.*;
public class Test {
	public void dis(Book b) {
		System.out.println("ID:"+b.getId());
		System.out.println("Name:"+b.getName());
		System.out.println("price:"+b.getPrice());
	}
	public void disAll(List<Book> books) {
		for(Book b : books) {
			dis(b);
		}
	}
	public void search(List<Book> books,int id) {
		for(Book b : books) {
			if(b.getId()==id) {
				System.out.println("the book is available");
				dis(b);
				return;
			}
		}
		System.out.println("book not available");
}
	public boolean delete(List<Book> books,int id) {
		int i=0;
		for(Book b: books) {
			if(b.getId()==id) {
				books.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}
	public static void main(String[] args) {
		Book book;//declaration of book object
		List<Book> books=new ArrayList<Book>();
		book= new Book(101,"java",200);
		books.add(book);
		book= new Book(102,"spring",300);
		books.add(book);
		
		book= new Book(103,"hibernate",400);
		books.add(book);

		book= new Book(104,"html",500);
		books.add(book);
		Test t=new Test();
		System.out.println("before deleting");
		t.disAll(books);
		t.search(books, 104);
		t.delete(books, 103);
		System.out.println("after deleting");
		
		Book engBooks;
		List<Book> engBook=new ArrayList<Book>();
		engBooks=new Book(501,"maths",5000);
		engBook.add(engBooks);
		engBooks=new Book(502,"pp",6000);
		engBook.add(engBooks);
		engBooks=new Book(503,"ma",7000);
		engBook.add(engBooks);
	}
	}
	

