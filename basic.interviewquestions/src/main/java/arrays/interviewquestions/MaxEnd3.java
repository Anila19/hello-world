package arrays.interviewquestions;

import java.util.Arrays;

public class MaxEnd3 {
public static void main(String[] args){
	int[] max = {11,5,9};
	//int[] result =;
	System.out.println(Arrays.toString( maxEnd3(max)));
}
public static int[] maxEnd3(int[] nums){
	int[] max = new int[nums.length];
	max[0] = nums[0];
	if(nums[2]>=max[0])
		max[0]=nums[2];
	max[1]=max[0];
	max[2]=max[0];
	return max;
	
	
}
}
