
//code to read data from json file
package jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	
	    public static void main(String[] args) {
	        try {
	            // Specify the path to your JSON file
	            String filePath = "C:\\Users\\shubham ghuge\\eclipse-workspace\\JsonProject\\JsonFiles\\students.json";

	            // Create a JSONParser instance
	            JSONParser jsonParser = new JSONParser();

	            // Parse the JSON file into a JSONArray
	            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(filePath));

	            // Iterate through each student
	            for (Object obj : jsonArray) {
	                JSONObject studentObject = (JSONObject) obj;

	                // Extract student details
	                String firstName = (String) studentObject.get("firstname");
	                String lastName = (String) studentObject.get("lastname");
	                String address = (String) studentObject.get("address");

	                // Display student information
	                System.out.println("First Name: " + firstName);
	                System.out.println("Last Name: " + lastName);
	                System.out.println("Address: " + address);
	                System.out.println();
	            }

	        } catch (IOException | ParseException e) {
	            e.printStackTrace();
	        }
	    }
}

