package class_06_01_26_Heirarchial_inheritance_Content_Example;

public class Youtube extends Content_Creator{
	
	int videos;
	
	Youtube(int followers, int videos){
		this.followers = followers;
		this.videos = videos;
		
		reach = followers * videos;
	
		System.out.println("The follwers count is -> " + followers);
		System.out.println("The videos count is -> " + videos);

		System.out.println("The reach of the Youtuber is -> " + reach);
		
		
		
	}

}
