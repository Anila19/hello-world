package Strings.Interviews;

public class ReturnStringHowMAnyTimesWePassNumber {
public static void main(String[] args){
	String name = "hi";
	int n = 2;
String result =	addStringNumberOftimes(name,n);
System.out.println(result);
	
}
public static String addStringNumberOftimes(String str ,int n){
	String result = "";
	for(int i =0 ;i<n;i++){
		result = result+str;
	}
	return result;
}
}
