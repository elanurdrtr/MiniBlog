package Wordpress;

import java.util.Iterator;
import java.util.Scanner;

//public class Application {
	public static void main(String[] args){
		
		while(true)
		{
			Menu.printMenu();
			Scanner input  = new Scanner(System.in);
			int value=input.nextInt();
			processInput(value);
			
		}
	}

	private static void processInput(int value) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		switch(value){
		
		case 0:
			System.out.println("Exiting....");
			System.exit(0);
			break;
			
		case 1 :
			System.out.println("Enter Title");
			String title = input.next();
			System.out.println("Enter Body");
			String body = input.next();
			System.out.println("Enter Category");
			String category = input.next();
			Page newpage = new Page(title,body,category);
			break;
		
		case 2 : 
			System.out.println("Enter Type:");
			String type = input.next();
			
			if(type.equals("video")){
			System.out.println("Enter Title");
			String title1  = input.next();
			System.out.println("Enter Body");
			String body1 = input.next();
			System.out.println("Enter Category");
			String category1 = input.next();
			System.out.println("Enter Url");
			String url = input.next();
			Video newVideo = new Video(title1,body1,category1,url);
			
			Menu.printVideoMenu();
			}
			if(type.equals("text")){
				
				System.out.println("Enter Title");
				String title2  = input.next();
				System.out.println("Enter Body");
				String body2 = input.next();
				System.out.println("Enter Category");
				String category2 = input.next();
				System.out.println("Enter Summary");
				String sum = input.next();
				Text newText = new Text(title2,body2,category2,sum);
					
				Menu.printTextMenu();
			}
			break;
				
			
		case 3:
			
			Iterator<Video> videoposts = Menu.printVideoMenu();
			while(videoposts.hasNext())
			{
				System.out.println(videoposts.next().toString());
			}
			Iterator<Text> textposts = Menu.printTextMenu();
		
			
	
	*/
	
	
	


	

	
