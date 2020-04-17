package algorithmsandconstructs.s2019148;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

public class Feed implements FeedInterface {

	private List<FeedItem> itens = new ArrayList<FeedItem>();
	// that will hold all FeedItems.creating the collector

	@Override
	public void addItem(FeedItem item) {
		itens.add(item);
	}

	@Override
	public Collection<String> listTitles() {

		return itens.stream().map(FeedItem::getTitle).collect(Collectors.toList());
	}

	/**
	 * Reference Accumulate names into a List List<String> list =
	 * people.stream().map(Person::getName).collect(Collectors.toList());
	 ** https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
	 */

	@Override
	public FeedItem getItem(String title) {

		FeedItem feedFound = null;
		int x = 0;
		for (x = 0; x < itens.size(); x++) {
			FeedItem fi = itens.get(x);
			if (title.equalsIgnoreCase(fi.getTitle())) {
				feedFound = fi;
			}
		}
		return feedFound;
	}

	/**return itens.stream().filter(i -> title.equalsIgnoreCase(i.getTitle())).findAny().get();
	 * https://www.geeksforgeeks.org/java-stream-findany-with-examples/
	 * https://java2blog.com/java-8-stream-filter-examples/ // Filer based on name
	 * Student student=studentList.stream() .filter(s->
	 * s.getName().equalsIgnoreCase("John")) .findAny() .orElse(null);
	 */

	@Override
	public int numItems() {
		// TODO Auto-generated method stub
		return itens.size();
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		Collection<FeedItem>listFound = new ArrayList<FeedItem>();
		int x = 0;
		for (x = 0; x < itens.size(); x++) {
			FeedItem i = itens.get(x);
			if(i.getTitle().contains(keyword)|| i.getContent().contains(keyword)) {
				listFound.add(i);
			}
		}
		return listFound;

	}
		/**
		 * https://www.geeksforgeeks.org/stream-in-java/
		 * https://www.programcreek.com/java-api-examples/?class=java.util.Optional&method=isPresent
		 * https://www.baeldung.com/java-optional .isPresent()
		 * 
		 */
	

}