/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
public class incollection extends dblp{

	private int mdate; /// to store mdate
	private String key; /// to store key
	private String title; /// to store title

	private int year; /// to store year
	private String ee; /// to store ee
	private String pages; /// to store pages
	/// constructor to initialize variables
	public incollection(){
		super();
		mdate= 0;
		key=null;
		title=null;
		year= 0;
		ee=null;
		pages=null;
	}
	
	public int getMdate() {return mdate;}/// Getter
	
	public void setMdate(int mdate) {this.mdate = mdate;}/// Setter
	
	public String getKey() {return key;}/// Getter
	
	public void setKey(String key) {this.key = key;}/// Setter
	
	public String getTitle() {return title;}/// Getter
	
	public void setTitle(String title) {this.title = title;}/// Setter
	
	public int getYear(){return year;}/// Getter
	
	public void setYear(int year){this.year=year;}/// Setter
	
	public String getEe() {return ee;}/// Getter
	
	public void setEe(String ee) {this.ee = ee;}/// Setter
	
	public String getPages() {return pages;}/// Getter
	
	public void setPages(String pages) {this.pages = pages;}/// Setter


}
