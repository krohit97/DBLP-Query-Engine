/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class userxmlparser {
	/**
	 * Arraylist to store objects of type dblp class
	 **/
	public ArrayList<dblp> parserxml(InputStream in){
		ArrayList<dblp>user=new ArrayList<dblp>();
		try{
			parserhandler handler= new parserhandler();
			XMLReader parser=XMLReaderFactory.createXMLReader();
			parser.setContentHandler(handler);
			InputSource source =new InputSource(in);
			parser.parse(source);
			user=handler.getUsers();


		}
		catch(SAXException  e){
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;


	}
}
