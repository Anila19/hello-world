package patterns;

import java.util.HashMap;

public class Del1 {
public static void main(String[] args){
	String str = "abcdacbe";
	count(str);
}
public static void count(String str){
	HashMap<Character,Integer>hs = new HashMap<Character,Integer>();
	char[] ch = str.toCharArray();
	for(Character c :ch){
		if(hs.containsKey(c)){
			hs.put(c, hs.get(c)+1);
		}
		else{
			hs.put(c, 1);
		}
		
		
	}
	System.out.println("the value of hs " +hs);
	
}

	
}

