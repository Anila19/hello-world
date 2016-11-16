package Strings.Interviews;

public class ExchangeLastAndFirstWords {
public static void main(String[] args){
String name = "vnila";
 String result=sa(name);
 System.out.println(result);
}
public static String sa(String s){
	String mid = s.substring(1, s.length()-1);
	//System.out.println(mid);
	return s.charAt(s.length()-1)+mid+s.charAt(0);
}
}
