package Strings.Interviews;

public class ReturnFirst {
public static void main(String args[]){
	String name = "h";
	boolean b = true;
	String result = theEnd(name,b);
	System.out.println(result);
}
public static String theEnd(String str,boolean front){
	int len = str.length()-1;
	if(front == true){
	return	str.substring(0, 1);
	}
	
	else{
		return str.substring(len);
	}
	
	
}
}
