/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.util.ArrayList;

public class article extends dblp {
private int mdate; ///for storing date
private String key; ///for storing keys 
private ArrayList<String> author = new ArrayList<String>(); /// ArrayList for storing author list
private String title; /// for storing titles of book/journal 
private String pages; /// for storing number of pages 
private int year; /// for storing years
private String volume; ///for storing volume 
private String journal; /// for storing journal
private String number; /// for storing number
private String url; /// for storing url
private String ee; /// for storing ee

// Constructor for initializing the variables

public article(){
	super();
	mdate= 0;
	key=null;
	author=null;
	title=null;
	pages=null;
	year= 0;
	volume=null;
	journal=null;
	number=null;
	url=null;
	ee=null;
}
///Setter
public void setMdate(int mdate) {
	this.mdate = mdate;
}
///Setter
public void setKey(String key) {
	this.key = key;
}
///Setter
public void setTitle(String x){
	this.title=x;
}
///Setter
public void setPages(String x){
	this.pages=x;
}
///Setter
public void setYear(int x){
	this.year=x;
}
///Setter
public void setVolume(String x){
	this.volume=x;
}
///Setter
public void setJournal(String x){
	this.journal=x;
}
///Setter
public void setNumber(String x){
	this.number=x;
}
///Setter
public void setUrl(String x){
	this.url=x;
}
///Setter
public void setEe(String x){
	this.ee=x;
}
public int getMdate(){return mdate;} /// Getter
public String getKey(){return key;} /// Getter
public String getTitle(){return title;} /// Getter
public String getPages(){return pages;} /// Getter
public int getYear(){return year;} /// Getter
public String getVolume(){return volume;} /// Getter
public String getJournal(){return journal;} /// Getter
public String getNumber(){return number;} /// Getter
public String getUrl(){return url;} /// Getter
public String getEe(){return ee;} /// Getter


}
