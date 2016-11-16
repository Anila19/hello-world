package Strings.Interviews;

public class RemoveIntergercharacter {
public static void main(String[] args){
	String s = "hello";
	int i = 2;
	nTwice(s,i);
}
public static String nTwice(String s, int n){
	String sub = s.substring(0, n)+s.substring(s.length()-n);
	System.out.println(sub);
	return sub;
}
}
