package basic.interview.questions;

public class SwapNumbers {
public static void main(String[] args){
	int a =5;
	int b =8;
	numbers(a,b);
}
public static void numbers(int a ,int b){
	 a = a+b;//5+3 =8
	 b= a-b;//8-3=5;
	 a=a-b;//8-5=3
	System.out.println("the value of a is " +a+ " the value of b is "+b);
}
}
