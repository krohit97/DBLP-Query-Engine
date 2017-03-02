/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.util.ArrayList;
public class www extends dblp{

	private int mdate;/// to store date
	private String key; /// to store key
	private ArrayList<String> author = new ArrayList<>(); /// arraylist to store authors
	private String title; /// to store title
///constructor to initialize variables 
	public www(){
		super();
		mdate= 0;
		key=null;
		author=null;
		title=null;
	}
	//Getter
	public int getMdate() {
		return mdate;
	}
	//Setter
	public void setMdate(int mdate) {
		this.mdate = mdate;
	}
	//Getter
	public String getKey() {
		return key;
	}
	//Setter
	public void setKey(String key) {
		this.key = key;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}

}
