import java.util.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * 
 * @author Coding.Troll(Richard Monseglio)
 *
 */
public class FavoriteSongRefactored {

	public static void main(String[] args) {
//		
		Hashtable<String, String> bandInfo = new Hashtable<String, String>();
		
		bandInfo.put("Song Title:", "BloodFeather");
		bandInfo.put("Artist:", "Highly Suspect");
		bandInfo.put("Album:", "Mister Asylum");
		bandInfo.put("ReleaseDate:", "2015");
		bandInfo.put("Genre:", "Alternative/Indie Rock");
		
		if(!bandInfo.isEmpty()) {
			Iterator myLists = bandInfo.entrySet().iterator();
			while(myLists.hasNext()) {
				Map.Entry obj = (Entry)myLists.next();
				System.out.println(obj.getKey());
				System.out.println(obj.getValue());
			}
		}
		

	}

}
