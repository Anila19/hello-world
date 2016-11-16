package arrays.interviewquestions;

import java.util.Arrays;

public class PlusTwo {
public static void main(String[] args){
	int[] a= {1,2,3};
	int[] b = {4,5,6};
	int[] plus = plusTwo(a,b);
	System.out.println(Arrays.toString(plus));
}
public static  int[] plusTwo(int[] a, int[] b) {
	int i;
	int[] sum =new int[ a.length+b.length];
	for( i =0;i<a.length;i++){
		sum[i] =a[i];
	}
	for(int j =0;j<b.length;j++){
		sum[i++]=b[j];
	}
	return sum;
}
}
