package Strings.Interviews;

public class BackAround {
public static void main(String[] args){
	String name = "cat";
	String result = back(name);
	System.out.println(result);
}
public static String back(String str){
	return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
}
}
