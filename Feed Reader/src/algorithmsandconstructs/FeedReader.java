package algorithmsandconstructs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Modify this to match your package
import algorithmsandconstructs.s2019148.FeedFactory;

public class FeedReader {
	
	public static void main(String[] args) throws IOException {
	 
		FeedFactoryInterface factory =  new FeedFactory();
    
		
		String file = "test.rss";
		BufferedReader in = new BufferedReader(new FileReader(file));
    
		FeedInterface feed = factory.createFeed(in);
    
		System.out.println("=== News items ===");
		
		for(String title : feed.listTitles()) {
			System.out.println(title);
		}
		
	}
}
