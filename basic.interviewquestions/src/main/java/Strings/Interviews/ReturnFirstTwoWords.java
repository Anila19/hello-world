package Strings.Interviews;

public class ReturnFirstTwoWords {
public static void main(String[] args){
	String str = "an";
	firstTwo(str);
}
public static String firstTwo(String str){
	if(str.length() <2){
 System.out.println( str);;
 return str;
	}
	String sub = str.substring(0, 2);
	System.out.println(sub);
	return sub;
}
}
