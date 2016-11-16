package Strings.Interviews;

public class RemoveFirstLAst {
public static void main(String[] args){
	String name = "a";
	String result = remove(name);
	//System.out.println(result);
}
public static String remove(String str){
	int len = str.length();
	if(len==1 ||len==0){
		
		return "";
	}
	String sub = str.substring(1,len-1);
	System.out.println(sub);
	return sub;
}
}
