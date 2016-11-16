package Strings.Interviews;

public class FristThreeCharactersOfStrign {
public static void main(String args[]){
	String name = "java";
	String result = nameChange(name);
	System.out.println(result);
}
public static String nameChange(String name){
	String front;
	if(name.length()>=3){
		front = name.substring(0, 3);
		
	}
	else{
		front = name;
	}
	return front+front+front;
}
}
