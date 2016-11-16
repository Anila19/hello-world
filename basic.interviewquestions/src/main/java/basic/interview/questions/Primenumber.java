package basic.interview.questions;

public class Primenumber {
public static void main(String[] args){
	int num= 121;
	prime(num);
}
public static void prime(int number){
	if(number<=2){
		return;
	}
	int i;
	for(i=2;i<=number/2;i++){
		if(number%i==0){
			System.out.println("the number is not prime number");
			return;
		}
			
		
		
		else{
			System.out.println("the number is prime number");
			return;
			
		}
			
	}
}
}
