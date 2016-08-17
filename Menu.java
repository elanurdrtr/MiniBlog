package Wordpress;

import java.util.Iterator;

public class Menu {
	
	public static void printMenu(){
		StringBuilder menu =new StringBuilder();
		
		menu.append("-Blog-");
		menu.append("--------\n");
		menu.append("(1)-Add Blog-\n");
		menu.append("--------\n");
		menu.append("(2)-Add Post-\n");
		menu.append("-------\n");
		menu.append("()-Add Comments-\n");
		menu.append("---------\n");
		menu.append("(3)-Show Pages-\n");
		menu.append("----------\n");
		menu.append("(4)-Show Posts-\n");
		
		System.out.println(menu);
		
	
		}
		
	public static void printVideoMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Video Post\n");
		menu.append("----------------\n");
		menu.append("\n");
		System.out.println(menu);
	}

	public static Iterator<Text> printTextMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Video Post\n");
		menu.append("\n");
		menu.append("You have to choose title, body or comment!");
		System.out.println(menu);
		return null;
	}

	public static void printCommentMenu() {
		StringBuilder menu = new StringBuilder();
		Iterator<Post> itPages = PageHelper.getPosts();
		int i = 1;
		boolean hasPosts = PageHelper.hasPosts();
		menu.append("-Pages-\n");
		menu.append("--\n");
		if (hasPosts) {
			while (itPages.hasNext()) {
				Page currentPage = itPages.next();
				menu.append(i++);
				menu.append("-) ");
				menu.append(currentPage.getTitle());
				menu.append("\n");
			}
			menu.append("");
		} else {
			menu.append("No Post To comment");
			
		}

		System.out.println(menu);
	}

	public static void printPages() {
		StringBuilder menu = new StringBuilder();
		Iterator<Page> itPages = PageHelper.getPages();
		int i = 1;

		menu.append("-Pages-\n");
		menu.append("------------\n");
		while (itPages.hasNext()) {
			Page currentPage = itPages.next();
			menu.append(i++);
			menu.append(currentPage.getTitle());
			menu.append(" - Category: ");
			menu.append(currentPage.getCategory());
			menu.append(" ------- ");
			menu.append(currentPage.getDate());
			menu.append("You have to choose title, body or comment\n");
			menu.append(currentPage.getBody());
			menu.append("-----\n");
		}
		System.out.println(menu);

	}

	public static void printPosts() {
		StringBuilder menu = new StringBuilder();
		Iterator<Post> itPosts = PageHelper.getPosts();
		int i = 1;

		menu.append("Posts\n");
		while (itPosts.hasNext()) {
			Post currentPost = itPosts.next();
			menu.append(i++);
			menu.append(currentPost.getTitle());
			menu.append(" - Category: ");
			menu.append(currentPost.getCategory());

			if (currentPost instanceof Video) {
				menu.append("Url: ");
				menu.append(((Video) currentPost).getUrl());
			}
			menu.append(" ------ ");
			menu.append(currentPost.getDate());
			menu.append("You have to choose title, body or comment!\n");
			menu.append(currentPost.getBody());

			Iterator<Comment> itComments = currentPost.getComments();
			while (itComments.hasNext()) {
				Comment currentComment = itComments.next();
				menu.append("Comments: \n");
				menu.append(currentComment.getAuthor());
				menu.append(" - ");
				menu.append(currentComment.getDate());
				menu.append("You have to choose title, body or comment!\n");
				menu.append(currentComment.getText());
				
			}
			menu.append("\n-----\n");
		}
		System.out.println(menu);

}
		
		
		
		
		
		
		
	}
	
	
	


