package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> myMap=new HashMap<String,String>();

		myMap.put("name","legend");
		myMap.put("age","25");
		myMap.put("job","studendt");

		System.out.println(myMap.get("name"));
		System.out.println(myMap.get("age"));
		System.out.println(myMap.get("job"));

		boolean isContainsKey = myMap.containsKey("name");
		if(isContainsKey){
			System.out.println("isContainsKey :"+isContainsKey);
		}
		boolean isContainsValue = 
				myMap.containsValue("student");
		if(isContainsValue){
			System.out.println("isContainsvalue:"+isContainsValue);

		}
		int mapSize = myMap.size();
		System.out.println("mapSize :" + mapSize);
		
		showHashMap(myMap);
		boolean removeResult = myMap.remove("name","legend");
		System.out.println("removerResult:"+removeResult);
		showHashMap(myMap);
		
		

	}
	public static void showHashMap(Map<String,String>input){
		Iterator<String> keys = input.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			System.out.println("maMap.get(\""+key+"\")="+input.get(key));
		}
	}
	
}