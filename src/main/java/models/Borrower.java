package models;

import java.util.Set;

public class Borrower {

	private int id;
	private String name;
	private Set<Book> itemsBorrowed;


	public Borrower(String name, Set<Book> itemsBorrowed) {
		this.name = name;
		this.itemsBorrowed = itemsBorrowed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getItemsBorrowed() {
		return this.itemsBorrowed;
	}

	public void setItemsBorrowed(Set<Book> itemsBorrowed) {
		this.itemsBorrowed = itemsBorrowed;
	}
}


