package Strings.Interviews;

public class Rotated2characersLeft {
public static void main(String[] args){
String str = "hello";
 String result = left2(str);
 System.out.println(result);
}
public static String left2(String str){
	String str1 ="";
	
		str1 = str.substring(2)+str.substring(0, 2);
	return str1;
}
}
