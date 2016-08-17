package Wordpress;

public class Video extends Post {
	
	private String url;
	
	public Video(String title, String body,String category,String url){
		
		super(title,body,category);
		this.url = url;
		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
