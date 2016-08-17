package Wordpress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Post extends Page {
	
	
		private List<Comment> comments = new ArrayList<>();

		public Post(String title, String body, String category) {
			super(title, body, category);
		}

		
		public Iterator<Comment> getComments() {
			return this.comments.iterator();
		}

		public void addComment(Comment comment) {
			this.comments.add(comment);
	}
	 
	
	
	 
	

}
