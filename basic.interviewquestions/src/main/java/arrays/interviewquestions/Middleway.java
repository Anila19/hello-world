package arrays.interviewquestions;

import java.util.Arrays;

public class Middleway {
public static void main(String[] args){
	int[] a = {1,2,3};
	int[] b = {4,5,6};
	int[] result = middleWay(a,b);
}
public static int[] middleWay(int[] a, int[] b) {
	
	int sum = a.length/2+b.length/2;
	System.out.println(sum);
	int[] mid = new int[sum];
	for(int i =0;i<mid.length;){
		mid[i]= a[1];
		i++;
		mid[i]= b[1];
		break;
	}
	
	System.out.println(Arrays.toString(mid));
	
	return mid;
	  
}
}