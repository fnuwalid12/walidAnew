package InterviewPractics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

public class MixedExample {

	public static void main(String[] args) {
		
		Map<String, ArrayList<HashMap<String, String>>> data = new HashMap<String, ArrayList<HashMap<String, String>>>();
		
		data.put("student", new ArrayList<>());
		data.get("student").add(new HashMap<>());
		data.get("student").get(0).put("firstName", "jack");
		data.get("student").get(0).put("lastName", "Davidson");
		
		data.get("student").add(new HashMap<>());
		data.get("student").get(1).put("firstName", "David");
		data.get("student").get(1).put("lastName", "jackson");
		
		data.put("teacher", new ArrayList<>());
		data.get("teacher").add(new HashMap<>());
		data.get("teacher").get(0).put("firstName", "Ahmad");
		data.get("teacher").get(0).put("lastName", "Davidson");
		//System.out.println(data);
		
		for (String Mainkey : data.keySet()) {
		System.out.println("************" + Mainkey+ "**************");	
		
		for (int i = 0; i < data.get("student").size(); i++) {
				for (String key: data.get("student").get(i).keySet()) {
					System.out.println(data.get("student").get(i).get(key));
				
				}
				System.out.println("------------------");
			}	
		}	
	}

}
