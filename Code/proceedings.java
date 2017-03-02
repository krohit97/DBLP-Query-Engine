/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.util.ArrayList;
public class proceedings extends dblp{

  	private int mdate;/// to store date
  	private String key; /// to store key
  	private ArrayList<String> author = new ArrayList<>();/// arraylist to store list of authors
  	private String title;/// to store title

    private String volume;/// to store volume
    private int year;/// to store year
    private String url;/// to store url

/// Constructor to initialize variables
    public proceedings(){
    	super();
    	mdate= 0;
    	key=null;
    	author=null;
    	title=null;
    	year= 0;
    	volume=null;
    	url=null;
    }

  	public int getMdate() {return mdate;}///Getter
  	public void setMdate(int mdate) {this.mdate = mdate;}///Setter

  	public String getKey() {return key;}///Getter
  	public void setKey(String key) {this.key = key;}///Setter

  	public String getTitle() {return title;}///Getter
  	public void setTitle(String title) {this.title = title;}///Setter

    public int getYear(){return year;}///Getter
    public void setYear(int year){this.year=year;}///Setter

    public String getVolume() {return volume;}///Getter
  	public void setVolume(String volume) {this.volume = volume;}///Setter

    public String getUrl() {return url;}///Getter
    public void setUrl(String url) {this.url = url;}///Setter

}
