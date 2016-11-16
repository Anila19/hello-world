package Strings.Interviews;

public class AddFirstTwoCharactersToString {
public static void main(String[] args){
	String name = "abc";
	String result = adding(name);
	System.out.println(result);
}
public static String adding(String str){
//	String add = str.substring(0, 2);
//	return add+str+add;
	 int take = 2;
	  if (take > str.length()) {
	    take = str.length();
	  }
	  
	  String front = str.substring(0, take);
	  return front + str + front;
}
}
