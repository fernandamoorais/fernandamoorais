package algorithmsandconstructs;

import java.util.Collection;

public interface FeedInterface {

  /**
   * This method should add a new FeedItem into the Feed	
   * @param item -New Feed item
   */
  public void addItem(FeedItem item);

  /**
   * This method returns a collection of the titles of all the
   * items in the feed.
   * 
   * @return a list of titles of all the items in the feed.
   */
  public Collection<String> listTitles();
  
  /**
   * This method returns the FeedItem with the given title, or 
   * null if no item has the given title. You can assume that 
   * no two items will have the same title 
   * 
   * @param  title the title of the item to find.
   * @return the FeedItem with the given title or null if no 
   *         item has the given title.
   */
  public FeedItem getItem(String title);
  
  /**
   * This method returns the number of items in the feed.
   * 
   * @return the number of items in this feed.
   */
  public int numItems();
  
  /**
   * This method returns a collection of all the items that 
   * have the given keyword in either the title or the 
   * content of the item. If no matching item is found, the
   * method should return an empty collection.
   * 
   * @param keyword the keyword to search for.
   * @return a collection of all the items that have the given
   *         keyword in the title or the content.
   */
  public Collection<FeedItem> findItems(String keyword);
  
}

//END
   
  
  /**will receive a instance of FeedItem class
   *  A method to input the title and content of the feedItem.
   * buffered
   * get/set title
   * get/set content
   * wrap to send it to another method
   *  @param item -New Feed item
   */
  
  /** This method returns a collection of the titles of all the
   * items in the feed.@return a list of titles of all the items in the feed.
   * A method that creates and return a array of all titles. (Arraytitles)
   */
 
    
   /** This method returns the FeedItem with the given title, or 
   * null if no item has the given title. You can assume that 
   * no two items will have the same title 
   * 
   *create a method to read the title input and compare w the array of titles and return the FeedItem or null.
   *
   * 
   * @param  title the title of the item to find.
   * @return the FeedItem with the given title or null if no 
   *         item has the given title.
   ***
   * This method returns the number of items in the feed.
   * Method to count number of index into the ArrayList
   * ArrayList<FeedItem>
   * 
   * @return the number of items in this feed.
   */
 
  
  /** methods that search on the title and into the content for the keyword and return all results.
   * 
   * This method returns a collection of all the items that 
   * have the given keyword in either the title or the 
   * content of the item. If no matching item is found, the
   * method should return an empty collection.
   * 
   * @param keyword the keyword to search for.
   * @return a collection of all the items that have the given
   *         keyword in the title oneeeeent.
   */
}
