package Strings.Interviews;

public class HiReturn {
public static void main(String[] args){
	String name = "ha";
	boolean result = strat(name);
	System.out.println(result);
}
public static boolean strat(String h){
	if(h.startsWith("hi")){
		return true;
		
	}
	return false;
}
}
