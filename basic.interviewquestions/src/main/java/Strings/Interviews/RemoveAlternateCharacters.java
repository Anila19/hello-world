package Strings.Interviews;

public class RemoveAlternateCharacters {
public static void main(String[] args){
	String h = "hello";
String result=	alternatecahracters(h);
System.out.println(result);
}
public static String alternatecahracters(String str){
	String result = "";
	for(int i =0;i<str.length();i+=2){
	result = result+str.charAt(i);
	}
	return result;
}
}
