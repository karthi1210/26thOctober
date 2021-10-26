package org.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleRead {
	
	public static void main(String[] args) throws IOException, ParseException {
		//Practice
		
		FileReader reader = new FileReader("C:\\Users\\Karthiksofia\\eclipse-workspace\\MavenFirstDay\\Sample.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object object = jsonParser.parse(reader);
		
		JSONObject jsonObject = (JSONObject) object;
		
		System.out.println(jsonObject.get("name").toString());
		
		System.out.println(jsonObject.get("mail").toString());
		
		System.out.println(jsonObject.get("age").toString());
		
		System.out.println("---------------------------------");
		
		//Task 1
		
		FileReader reader1 = new FileReader("C:\\Users\\Karthiksofia\\eclipse-workspace\\MavenFirstDay\\Task1.json");
		
		JSONParser jsonParser1 = new JSONParser();
		
		Object object1 = jsonParser1.parse(reader1);
		
		JSONObject jsonObject1 = (JSONObject) object1;
		
		System.out.println(jsonObject1.get("job"));
		
		System.out.println(jsonObject1.get("id"));
	}

}
