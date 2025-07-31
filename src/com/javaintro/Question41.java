package com.javaintro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
		
		class BookStore {
		    private int bookId;
		    private String bookName;

		    
		    public BookStore(int bookId, String bookName) {
		        this.bookId = bookId;
		        this.bookName = bookName;
		    }

		   
		    public int getBookId() {
		        return bookId;
		    }

		    public String getBookName() {
		        return bookName;
		    }

		    @Override
		    public String toString() {
		        return "BookStore [bookId=" + bookId + ", bookName=" + bookName + "]";
		    }
		}

	public class Question41{
		    public static void main(String[] args) {
		        List<BookStore> books = new ArrayList<>();
		        books.add(new BookStore(102, "Java Programming"));
		        books.add(new BookStore(101, "Data Structures"));
		        books.add(new BookStore(104, "Algorithms"));
		        books.add(new BookStore(103, "Java Programming"));

		        System.out.println("Before Sorting:");
		        for (BookStore b : books) {
		            System.out.println(b);
		        }

		        
		        Collections.sort(books, Comparator.comparing(BookStore::getBookName));
		        System.out.println("\nSorted by bookName:");
		        for (BookStore b : books) {
		            System.out.println(b);
		        }

		       
		        Collections.sort(books, Comparator.comparingInt(BookStore::getBookId));
		        System.out.println("\nSorted by bookId:");
		        for (BookStore b : books) {
		            System.out.println(b);
		        }

		       
		        Collections.sort(books, Comparator.comparing(BookStore::getBookName)
		                                          .thenComparing(BookStore::getBookId));
		        System.out.println("\nSorted by bookName and then bookId:");
		        for (BookStore b : books) {
		            System.out.println(b);
		        }
		    }
		
	}
/*
 Before Sorting:
BookStore [bookId=102, bookName=Java Programming]
BookStore [bookId=101, bookName=Data Structures]
BookStore [bookId=104, bookName=Algorithms]
BookStore [bookId=103, bookName=Java Programming]

Sorted by bookName:
BookStore [bookId=104, bookName=Algorithms]
BookStore [bookId=101, bookName=Data Structures]
BookStore [bookId=102, bookName=Java Programming]
BookStore [bookId=103, bookName=Java Programming]

Sorted by bookId:
BookStore [bookId=101, bookName=Data Structures]
BookStore [bookId=102, bookName=Java Programming]
BookStore [bookId=103, bookName=Java Programming]
BookStore [bookId=104, bookName=Algorithms]

Sorted by bookName and then bookId:
BookStore [bookId=104, bookName=Algorithms]
BookStore [bookId=101, bookName=Data Structures]
BookStore [bookId=102, bookName=Java Programming]
BookStore [bookId=103, bookName=Java Programming]
 */

