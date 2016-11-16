package Strings.Interviews;

public class LastThreeCharactersUpperCase {
public static void main(String[] args){
	String name = "anila";
	String result = up3Characters(name);
	System.out.println(result);
}
public static String up3Characters(String str){
	if(str.length()<3){
		return str.toUpperCase();
		
	}
	int cut = str.length()-3;
	String front= str.substring(0, cut);
	System.out.println(front);
	String back = str.substring(cut);
	return front+back.toUpperCase();
}
}
