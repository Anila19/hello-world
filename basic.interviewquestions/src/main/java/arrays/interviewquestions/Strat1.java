package arrays.interviewquestions;

public class Strat1 {
public static void main(String[] args){
	int[] a = {1,2,3};
	int[] b = {1,2,3};
	start1(a,b);
}
public static int start1(int[] a,int[] b){
	
	int ones = 0;
	if(a.length >= 1 && a[0] == 1)
		ones += 1;
	if(b.length >= 1 && b[0] == 1)
		ones += 1;
	return ones;
}
}
