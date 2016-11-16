package Strings.Interviews;

public class AddingfirstThreeCharactersWithArgument {
public static void main(String[] args){
	String result =frontTimes("anila",2);
	System.out.println(result);
}
public static String frontTimes(String str,int n){
	int frontLen = 3;
	  if (frontLen > str.length()) {
	    frontLen = str.length();
	  }
	  String front = str.substring(0, frontLen);
	  
	  String result = "";
	  for (int i=0; i<n; i++) {
	    result = result + front;
	  }
	  return result;
}
}
