package arrays.interviewquestions;

import java.util.Arrays;

public class Makesend {
public static void main(String[] args){
	int[] a = {1,2,3};
	int[] result  = makesEnd(a);
	System.out.println(Arrays.toString(result));
}
public static int[] makesEnd(int[] nums){
	int[] make = new int[2];
	make[0] = nums[0];
	make[1]= nums[nums.length-1];
	
	return make;
	
}
}
