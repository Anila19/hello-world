package Strings.Interviews;

public class MixStart {
public static void main(String[] args){
	String name = "piz pizza";
	boolean result = mix(name);
	System.out.println(result);
}
public static boolean mix(String str){
	if(str.length()<3){
		return false;
	}
	String mid = str.substring(1, 3);
	if(mid.equals("ix")){
		return true;
	}
	else{
		return false;
	}
}
}
