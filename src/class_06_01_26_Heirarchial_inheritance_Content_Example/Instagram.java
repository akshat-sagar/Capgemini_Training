package class_06_01_26_Heirarchial_inheritance_Content_Example;

public class Instagram extends Content_Creator{

	int reels;
	
	Instagram(int reels, int followers){
		this.reels = reels;
		this.followers = followers;
		
		int reach = reels * followers;
		
		System.out.println("The follwers count is -> " + followers);
		System.out.println("The videos count is -> " + reels);

		System.out.println("The reach of the Instagram Page is -> " + reach);
		

	}
	
}
