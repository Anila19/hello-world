package Strings.Interviews;
// below i kept space after not to create space
public class AddingNot {
	public static void main(String[] args){
		String name = "candy";
	String result=	adding(name);
	System.out.println(result);
	}
public static String adding(String str){


	 if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
		    return str;
		  }
		  
		  return "not " + str;
		}
}	

