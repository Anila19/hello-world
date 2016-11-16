package Strings.Interviews;

public class OmitFirstcharacter {
public static void main(String[] args){
	String a = "hello";
	String b = "hai";
	String ans = nonStart(a,b);
	System.out.println(ans);
	
}
public static String nonStart(String a, String b){
	
	String sub = a.substring(1)+b.substring(1);
	
	return sub;
	
}
}
