package Strings.Interviews;

public class TwoChar {
public static void main(String[] args){
	String name = "java";
	int Index =3;
	String result = twochar(name,Index);
	System.out.println(result);
}
public static String twochar(String s, int Index){
	String sub = s.substring(Index);
	System.out.println(sub.length());
	if(Index > 2 || Index <=0){
		return s.substring(0, 2);
	}
	else{
		return s.substring(Index);
	}
	
	
}
}
