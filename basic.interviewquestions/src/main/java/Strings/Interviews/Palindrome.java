package Strings.Interviews;

public class Palindrome {
public static void main(String[] args){
	String name = "dad";
	pal(name);
}
public static void pal(String pal){
	int length  = pal.length();
    int i, begin, end, middle;
 
    begin  = 0;
    end    = length - 1;
    middle = (begin + end)/2;
 
    for (i = begin; i <= middle; i++) {
      if (pal.charAt(begin) == pal.charAt(end)) {
        begin++;
        end--;
      }
      else {
        break;
      }
    }
    if (i == middle + 1) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not a palindrome");
    } 	
  }
	
}
class pal{
	public static void main(String[] args){
		String val = "anila";
		name(val);
	}
	public static void name(String values){
		int len = values.length();
		String reverse ="";
		for(int i =len-1;i>=0;i--){
			reverse = reverse+values.charAt(i);
		}
		if(values.equalsIgnoreCase(reverse)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}
