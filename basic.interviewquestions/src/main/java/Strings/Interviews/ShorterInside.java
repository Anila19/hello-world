package Strings.Interviews;

public class ShorterInside {
public static void main(String[] args){
	String a = "hi";
	String b = "hello";
	String result = comboString( a , b);
	System.out.println(result);
}
public static String comboString(String a ,String b){
	int lena = a.length();
	int lenb = b.length();

	 if(lena > lenb){
		return b+a+b;
	}
	else{
		return a+b+a;
	}
	
}
}
