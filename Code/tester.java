/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public  class tester {
	//public static void main (String args[]) throws FileNotFoundException
	ArrayList<dblp> users=null;
	public void database() throws FileNotFoundException
	{
		File xmlFile=new File("dblp.xml"); /// Reading .xml file
		userxmlparser parser= new userxmlparser();///Parsing xml file
//		ArrayList<dblp> users=parser.parserxml(new FileInputStream(xmlFile));
		this.users=parser.parserxml(new FileInputStream(xmlFile));
		
		System.out.println(parserhandler.num);/// Parser handler will handle the tags while parsing like start, end, current tag
//		check c = new check();
//		
//		System.out.println("Enter a");	
//		Scanner s = new Scanner(System.in);
//		int g= s.nextInt();
//		if(g==0){
//			c.findAuthor(users);
//		}
//		System.out.println("==== Next ====");

		//return users;
		//System.out.println(users.keySet());
	}
	/**
	 * This method will return the Arraylist of objects
	 **/
	public ArrayList<dblp> getdata(){
		return this.users;
	}
}
