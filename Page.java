package Wordpress;

import java.time.LocalDate;

public class Page {
	
	private String title;
	private String body;
	private LocalDate date = LocalDate.now();
	private String category;
	
	public Page(String title, String body,  String category) {
		super();
		this.title = title;
		this.body = body;
		this.date = date;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public String getBody() {
		return body;
	}
	public LocalDate getDate() {
		return date;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	

}
