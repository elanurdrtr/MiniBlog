package Wordpress;

import java.time.LocalDate;

public class Comment {

	private String author, text;
	
	private LocalDate date = LocalDate.now();

	public Comment(String author, String text, LocalDate date) {
		super();
		this.author = author;
		this.text = text;
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Comment [author=" + author + ", text=" + text + ", date=" + date + "]";
	}
	
	
	
	
	
	
	
	
	
}
