package algorithmsandconstructs.s2019148;

import java.io.BufferedReader;
import java.io.IOException;

import algorithmsandconstructs.FeedFactoryInterface;
import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

public abstract class FeedFactory implements FeedFactoryInterface {

	@Override
	public FeedInterface createFeed(BufferedReader in) throws IOException {
		FeedInterface feed = new Feed();
		while (in.ready()) {
			try {

				feed.addItem(new FeedItem(in.readLine(), in.readLine()));
			}

			catch (Exception e) {
				// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
			
		}
		return feed;
	}
}

/**
 * String line1 = null; String line2=null; Feed myFeed= new Feed(); FeedItem
 * myItem = new FeedItem(line1, line2);//não teria que ser
 * 
 * try { BufferedReader in = new BufferedReader(new FileReader("test.rss"));
 * String strLine; String[] arrayList = new String[] {}; int i = 0; while
 * ((strLine = in.readLine()) != " ") {
 * 
 * arrayList[i]=in.readLine(); i++; } myFeed.addItem(new FeedItem());
 * in.close(); } , catch(Exception e) {// Catch exception if any
 * System.err.println("Error: " + e.getMessage()); } }
 * 
 * 
 * Feed myFeed= new Feed(); String line1= null; String Line2= null;
 * 
 * try {
 * 
 * BufferedReader in = new BufferedReader ("/test.rss"); line1= in.readLine();
 * while ( (line1=in.readLine()) != null){ line2= in.readLine();
 * myFeed.addItem(new FeedItem(line1,line2)); }
 * 
 * } catch (IOException e) { System.out.println("Unable to read the file."); }
 * //return myFeed;
 * 
 * }
 * 
 * 
 * 
 * /** criar uma instancia de Feed feed = new Feed;
 * 
 * FeedFactory vai ler o arquivo rss(createFeed )quando ler o arquivo ele vai
 * ter que salvar cada linha do arquivo dentro de uma instancia do FeedItem.
 * dessa leitura temos que criar uma instancia do FeedItem , pra criar a
 * variavel Item(title and content) que vai ser passado como parametro pro
 * método Add(que esta no feed) esse método que vai add esse item no ArrayList
 * que criamos no feed o metodo add só vai pegar o parametro Item que vai ser
 * passado no FeedFactory que vai add no ArrayList.
 * 
 * 
 * 
 * nessa instancia criar o metodo para addItem(); This FeedFactory, will create
 * the instance of the Feed, and will also create instances of the FeedItem
 * class using the data that is coming from the rss file, and will add them to
 * the feed using the addItem method.
 **/
