package com.tritux.genererJson;



import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.tritux.cvparsing.CV;


public class yo {
    public static void main(String[] args) {

	
    CV c = null;
	try {
		c = new CV();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Gson gson = new Gson();

	// convert java object to JSON format,
	// and returned as JSON formatted string
	String json = gson.toJson(c);

	try {
		//write converted json data to a file named "file.json"
		FileWriter writer = new FileWriter("file.json");
		writer.write(json);
		writer.close();

	} catch (IOException e) {
		e.printStackTrace();
	}

	System.out.println(json);

    }
}