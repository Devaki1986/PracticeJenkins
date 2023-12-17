import java.io.*;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

	public class maptojson {
		static FileReader fr;
		public static void main(String[] args) throws IOException, ParseException
		{
			//System.out.println("Hello");
			
			HashMap<String,String>hm = new HashMap<>();
			hm.put("test", "1");
			hm.put("test2", "2");
			hm.put("test3", "3");
			hm.put("test4", "5");
			hm.put("test5", "5");
			hm.put("test6", "te");
			hm.put("test7", "8ry");
			
			JSONObject json = new JSONObject(hm);
			//System.out.println(json);
			
			try {
				fr = new FileReader("D:\\new.json");
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			BufferedReader br = new BufferedReader(fr);
		    while(br.readLine()!=null)
			{
				//System.out.println(br.readLine());
			}
		    
	
		    JSONParser jsonParser = new JSONParser();
		    Object obj=jsonParser.parse(new FileReader("D:\\new.json"));
		    //one more way 
		    //Object obj = new JSONParser().parse(new FileReader(""));
		   // JSONObject json1 = new JSONObject(fr);
		 
			
		    
		   JSONObject json1 = (JSONObject)obj;
		  //  JSONArray jar = (JSONArray) obj;
		
		    System.out.println("json :"+ json1.getString("employee"));
		 
		    
		
			
			
		}

	}


