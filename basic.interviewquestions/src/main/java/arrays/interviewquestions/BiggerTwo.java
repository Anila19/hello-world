package arrays.interviewquestions;

import java.util.Arrays;

public class BiggerTwo {
public static void main(String[] args){
	int[] a = {1,1};
	int[] b={1,0};
	int[] result = biggerTwo(a,b);
	System.out.println(Arrays.toString(result));
}
public static int[] biggerTwo(int[] a,int[] b){
	int sum =0;
	int sum1=0;
	for(int i =0;i<a.length;i++){
		sum = sum+a[i];
	}
	for(int j =0; j<b.length;j++){
		sum1 = sum1+b[j];
	}
	if(sum ==sum1){
		return a;
	}
	else if(sum>sum1){
		return a;
	}
	else{
		return b;
	}
		
}
}
