/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.util.ArrayList;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class parserhandler extends DefaultHandler{
	static int num=0;
    private ArrayList<dblp> userList = new ArrayList<dblp>(); ///This is the list which shall be populated while parsing the XML.
    private Stack<String> elementStack = new Stack<String>(); ///As we read any XML element we will push that in this stack
    private Stack<dblp> objectStack = new Stack<dblp>(); ///As we complete one user block in XML, we will push the User instance in userList
    public void startDocument() throws SAXException{
        System.out.println("start of the document   : ");
    }
    public void endDocument() throws SAXException{
        System.out.println("end of the document document     : ");
    }
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        this.elementStack.push(qName); ///Push it in element stack
        ///If this is start of 'user' element then prepare a new User instance and push it in object stack
        ///if ("article".equals(qName)||"inproceedings".equals(qName)||"proceedings".equals(qName)||"book ".equals(qName)||"incollection".equals(qName)||"phdthesis".equals(qName)||"mastersthesis ".equals(qName)||"www".equals(qName))
        if ("article".equals(qName)){
        	article user = new article(); ///New User instance
            ///Set all required attributes in any XML element here itself
            if(attributes != null)
            {
            	user.setMdate(Integer.parseInt(attributes.getValue(0).replace("-",""))); ///Changing String date to int date removing '-'
            	user.setKey(attributes.getValue(1));
            }
            this.objectStack.push(user); ///pushing user object to stack
          }
          else if ("www".equals(qName)){
                  www user = new www();
                  if(attributes != null && attributes.getLength() == 1)
                    {
                    	user.setMdate(Integer.parseInt(attributes.getValue(0).replace("-","")));///Changing String date to int date removing '-'
                    	user.setKey(attributes.getValue(1));
                    }
                    this.objectStack.push(user);///pushing user object to stack
          }
          else if ("phdthesis".equals(qName)){
                  phdthesis user = new phdthesis();
                  if(attributes != null && attributes.getLength() == 1)
                    {
                      user.setMdate(Integer.parseInt(attributes.getValue(0).replace("-","")));///Changing String date to int date removing '-'
                      user.setKey(attributes.getValue(1));
                    }
                    this.objectStack.push(user);///pushing user object to stack
          }
          else if ("mastersthesis".equals(qName)){
                  mastersthesis user = new mastersthesis();
                  if(attributes != null && attributes.getLength() == 1)
                    {
                      user.setMdate(Integer.parseInt(attributes.getValue(0).replace("-","")));///Changing String date to int date removing '-'
                      user.setKey(attributes.getValue(1));
                    }
                    this.objectStack.push(user);///pushing user object to stack
          }
          else if ("inproceedings".equals(qName)){
                  inproceedings user = new inproceedings();
                  if(attributes != null){
                      user.setMdate(Integer.parseInt(attributes.getValue(0).replace("-","")));///Changing String date to int date removing '-'
                      user.setKey(attributes.getValue(1));
                    }
                    this.objectStack.push(user);///pushing user object to stack
          }
          else if ("proceedings".equals(qName)){
                  proceedings user = new proceedings();
                  if(attributes != null && attributes.getLength() == 1){
                      user.setMdate(Integer.parseInt(attributes.getValue(0).replace("-","")));///Changing String date to int date removing '-'
                      user.setKey(attributes.getValue(1));
                    }
                    this.objectStack.push(user);///pushing user object to stack
          }
          else if ("incollection".equals(qName)){
                  incollection user = new incollection();
                  if(attributes != null && attributes.getLength() == 1){
                      user.setMdate(Integer.parseInt(attributes.getValue(0).replace("-","")));///Changing String date to int date removing '-'
                      user.setKey(attributes.getValue(1));
                    }
                    this.objectStack.push(user);///pushing user object to stack
          }
    }
    public void endElement(String uri, String localName, String qName) throws SAXException{
    	if(elementStack.empty()!=true){
        this.elementStack.pop();//Remove last added </user> element
        }
        ///User instance has been constructed so pop it from object stack and push in userList
    	if ("article".equals(qName)){
            dblp object = this.objectStack.pop();
            num++;
            this.userList.add(object);
      }
      else if ("www".equals(qName)){
            dblp object = this.objectStack.pop();
            num++;
            this.userList.add(object);
      }
      else if ("mastersthesis".equals(qName)){
            dblp object = this.objectStack.pop();
            num++;
            this.userList.add(object);
      }
      else if ("phdthesis".equals(qName)){
            dblp object = this.objectStack.pop();
            num++;
            this.userList.add(object);
      }
      else if ("incollection".equals(qName)){
            dblp object = this.objectStack.pop();
            num++;
            this.userList.add(object);
      }
      else if ("inproceedings".equals(qName)){
            dblp object = this.objectStack.pop();
            num++;
            this.userList.add(object);
      }
      else if ("proceedings".equals(qName)){
            dblp object = this.objectStack.pop();
            num++;
            this.userList.add(object);
      }
    }
    /**
     * This will be called everytime parser encounter a value node
     * */
    public void characters(char[] ch, int start, int length) throws SAXException{
        String value = new String(ch, start, length).trim();
        if (value.length() == 0){
            return; /// ignore white space
        }
        if(objectStack.empty()!=true){
        dblp user = this.objectStack.peek();
        if ("title".equals(currentElement())){
        	if(objectStack.empty()!=true){
            user.setTitle(value);
            }
        }
        if ("author".equals(currentElement())){
        	if(objectStack.empty()!=true){
            user.author.add(value);
        	}
        }
        if ("journal".equals(currentElement())){
       		if(objectStack.empty()!=true){
       			user.setJournal(value);
       		}
       	}
        if ("volume".equals(currentElement())){
        	if(objectStack.empty()!=true){

            user.setVolume(value);
        	}
        }
        if ("year".equals(currentElement())){
        	if(objectStack.empty()!=true){
            user.setYear(Integer.valueOf(value.replace("-","")));
        	}
        }
        if ("pages".equals(currentElement())){
        	if(objectStack.empty()!=true){
            user.setPages(value);
        	}
        }
        if ("url".equals(currentElement())){
        	if(objectStack.empty()!=true){
            user.setUrl(value);
        	}
        }
        if ("ee".equals(currentElement())){
        	if(objectStack.empty()!=true){
            user.setEe(value);
        	}
        }
        }
    }
    /**
     * Utility method for getting the current element in processing
     * */
    private String currentElement(){
        return this.elementStack.peek();
    }
    public ArrayList<dblp> getUsers(){ ///Accessor for userList object
    	return userList;
    }
}
