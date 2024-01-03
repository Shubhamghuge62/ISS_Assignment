package XmlRead.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import XmlRead.model.Address;
import XmlRead.model.Person;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ObjectMapper mapper = new XmlMapper();
    		InputStream inputStream = new FileInputStream(new File("C://Users//shubham ghuge//eclipse-workspace//XmlProject//src//main//java//XmlRead//model//xmldata.xml"));
    		TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {};
    		List<Person> persons = mapper.readValue(inputStream, typeReference);
    		for(Person p :persons) {
    			System.out.println("Name is "+p.getFirstname()+" "+p.getLastname()+" ,city is "+p.getAddress().getCity()+" ,age is "+p.getAge());
    		}
            inputStream.close();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}