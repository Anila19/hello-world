package basic.interview.questions;

public class Factorial {
public static void main(String[] args){
	int num =5;
	numbersFace( num);
}
public static void numbersFace(int number){
	int fact = 1;

	for(int i =1;i<=number;i++){
		fact = fact*i ;
	}
	System.out.println("the result of number is "+fact);
}
}
