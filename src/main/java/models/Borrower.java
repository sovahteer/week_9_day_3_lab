package models;

import java.util.HashSet;
import java.util.Set;

public class Borrower {

	private int id;
	private String name;
	private Set<Book> itemsBorrowed;


	public Borrower(String name) {
		this.name = name;
		this.itemsBorrowed = new HashSet<>();
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


