package arrays.interviewquestions;

import java.util.Arrays;

public class Fix23 {
public static void main(String[] args){
	int[] fix = {1,2,1,2,3};
	int[] result = fix23(fix);
	
	System.out.println(Arrays.toString(result));
}
public static int[] fix23(int[] nums){
	for(int i =0;i<nums.length;i++){
		if(nums[i]==2 && nums[i+1]==3){
			nums[i+1]=0;
			
			}
		
	}
	return nums;
	
}
}
