package models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "borrowers")
public class Borrower {

	private int id;
	private String name;
	private Set<Book> itemsBorrowed;


	public Borrower(String name) {
		this.name = name;
		this.itemsBorrowed = new HashSet<>();
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
	public Set<Book> getItemsBorrowed() {
		return this.itemsBorrowed;
	}

	public void setItemsBorrowed(Set<Book> itemsBorrowed) {
		this.itemsBorrowed = itemsBorrowed;
	}

}


