package Strings.Interviews;

public class CountNumberOfx {
public static void main(String[] args){
String s = "axxbb";
boolean result = doublex(s);
System.out.println(result);
}
public static boolean doublex(String str){
	int i = str.indexOf("x");
	System.out.println(i);
	if(i ==-1)
		return false;
	if(i+1>=str.length())
		return false;
	String x = str.substring(i);
	return x.startsWith("x");
	
}
}

