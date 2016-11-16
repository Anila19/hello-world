package arrays.interviewquestions;

import java.util.Arrays;

public class SwapEnds {
public static void main(String[] args){
	int[] nums = {8,2,3,5};
	int[] result = swapEnds((nums));
	System.out.println(Arrays.toString(result));
}
public static int[] swapEnds(int[] nums){
	int temp =0;
	if(nums.length>1){
		temp = nums[0];
		nums[0]= nums[nums.length-1];
		nums[nums.length-1]=temp;
		
	}
	return nums;
}
}
