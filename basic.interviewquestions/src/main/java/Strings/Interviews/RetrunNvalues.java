package Strings.Interviews;

public class RetrunNvalues {
public static void main(String[] args){
	String name = "macbook";
	int n = 2;
String result =	everyN(name,2);
System.out.println(result);
}
public static String everyN(String str,int n){
	String result = "";
	for(int i =0;i<str.length();i=i+n){
		result=result+str.charAt(i);
	}
	return result;
}
}
