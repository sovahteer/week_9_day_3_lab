package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "borrowers")
public class Borrower {

	private int id;
	private String name;
	private List<Book> itemsBorrowed;


	public Borrower(String name) {
		this.name = name;
		this.itemsBorrowed = new ArrayList<>();

	}

	public Borrower() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "borrower", fetch = FetchType.LAZY)
	public List<Book> getItemsBorrowed() {
		return this.itemsBorrowed;
	}

	public void setItemsBorrowed(List<Book> itemsBorrowed) {
		this.itemsBorrowed = itemsBorrowed;
	}

	public void borrowBook(Book book){
	    if (!book.getOnLoan()) {
            this.itemsBorrowed.add(book);
            book.setOnLoan(true);
        }
    }

}


