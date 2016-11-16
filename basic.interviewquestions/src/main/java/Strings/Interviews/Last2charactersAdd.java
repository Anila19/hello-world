package Strings.Interviews;

public class Last2charactersAdd {
public static void main(String[] args){
	String  name = "hello";
 add(name);
	
}
public static void add(String str){
	String rev = "";
	int len = str.length()-2;
	String sub = str.substring(len)+str.substring(0, len);
	
}
}
