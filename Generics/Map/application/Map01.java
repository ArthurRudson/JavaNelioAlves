package application;

import java.util.Map;
import java.util.TreeMap;

public class Map01 {

	public static void main(String[] args) {
		
	 Map<String, String> cookies =  new TreeMap<>();

	 cookies.put("username", "Maria");
	 cookies.put("email", "maria@gmail.com");
	 cookies.put("phone", "9971122");
	 
	 cookies.remove("email");
	 
	 cookies.put("phone", "9971133"); //sobescreve 
	 
	 System.out.println("Conteins 'phone' key: " + cookies.containsKey("phone"));
	 
	 System.out.println("Phone number: " + cookies.get("phone"));
	 
	 System.out.println("Email: " +  cookies.get("email"));
	 
	 System.out.println("Size: " + cookies.size());
	 
	 System.out.println("All COOKIES:");
	 for (String key : cookies.keySet()) {
		System.out.println(key + ": " + cookies.get(key));
	}
	 
	 
	}

}
