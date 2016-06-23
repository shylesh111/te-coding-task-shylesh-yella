package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class BasicUtil {
	public static JSONObject getJSONObject()
	{
		JSONObject json = null;
		String fileName = "Data.json";
		
        final String filePath = new BasicUtil().getClass().getClassLoader().getResource(fileName).getPath();
        
		try{
			final FileReader reader = new FileReader(filePath);
            final JSONParser parser = new JSONParser();
            json = (JSONObject) parser.parse(reader);
			
		}
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
			 } catch (IOException e) {
			 e.printStackTrace();
			 } catch (ParseException e) {
			 e.printStackTrace();
			 }
		return json;
	
	}

}
