/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.util.ArrayList;

public abstract class dblp {
int mdate; /// to store date
String key; /// to store key
ArrayList<String> author = new ArrayList<>(); /// Arraylist to store authors
String title; /// to store titles
String pages; /// to store pages
int year; ///  to store year
String volume; /// to store volume
String journal; /// to store journals
String url; /// to store url
String ee; /// to store ee
String school; /// to store school

///Getter
public int getMdate() {
	return mdate;
}
///Setter
public void setMdate(int mdate) {
	this.mdate = mdate;
}
///Getter
public String getKey() {
	return key;
}
///Setter
public void setKey(String key) {
	this.key = key;
}
///Setter
void setTitle(String x){
	title=x;
}
///Getter
String getTitle(){
	return title;
}
///Getter
public String getPages() {
	return pages;
}
///Setter
public void setPages(String pages) {
	this.pages = pages;
}
///Getter
public int getYear() {
	return year;
}
///Setter
public void setYear(int year) {
	this.year = year;
}
///Getter
public String getVolume() {
	return volume;
}
///Setter
public void setVolume(String volume) {
	this.volume = volume;
}
///Getter
public String getJournal() {
	return journal;
}
///Setter
public void setJournal(String journals) {
	this.journal = journals;
}
///Getter
public String getUrl() {
	return url;
}
///Setter
public void setUrl(String url) {
	this.url = url;
}
///Getter
public String getEe() {
	return ee;
}
///Setter
public void setEe(String ee) {
	this.ee = ee;
}
///Getter
public String getSchool() {
	return school;
}
///Setter
public void setSchool(String school) {
	this.school = school;
}

/// to string method to display variables
public String toString(){
	return this.mdate + " " +this.key + " " +
	this.author + " " +this.title + " " +this.pages
	+ " " +this.year + " " +this.volume + " "
	+this.journal + " " +this.url + " " +this.ee;
}

}
