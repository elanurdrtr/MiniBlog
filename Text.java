package Wordpress;

public class Text extends Post{
	
	private String sum;

	public Text(String title, String body, String category, String sum) {
		super(title, body, category);
		
		this.sum = this.getBody().substring(0,11);
		// TODO Auto-generated constructor stub
	}

	public String getSum() {
		return sum;
	}

	
	
	

}
