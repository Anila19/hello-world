package arrays.interviewquestions;

import java.util.Arrays;

public class MakeLast {
public static void main(String[] args){
	int[] num = {1,2,3,6};
	int[] result = makelast(num);
}
public static int[] makelast(int[] nums){
	int len = nums.length*2;
	int[] num = new  int[len];
	num[num.length-1]= nums[nums.length-1];
	System.out.println(Arrays.toString(num));
	return num;
	
}
}
