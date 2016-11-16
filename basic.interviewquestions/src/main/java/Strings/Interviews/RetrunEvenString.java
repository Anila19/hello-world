package Strings.Interviews;

public class RetrunEvenString {
public static void main(String args[]){
	String st= "string";
	String result = middletwo(st);
	System.out.println(result);
}
public static String middletwo(String str){
String rev  = "";
int half = str.length()/2-1;
return str.substring(half, half+2);
	
}
}
