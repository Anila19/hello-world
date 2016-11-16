package arrays.interviewquestions;

import java.util.Arrays;

public class Sum13 {
public static void main(String[] args){
	int[] nums = {1,2,3,13,4,1,3,13,5};
	//int result = 
	sum(nums);
	//System.out.println(Arrays.toString(result));
	
}
public static int sum(int[] nums){
	/*int n =0 ;
	for(int i =0;i<nums.length;i++){
		
		if(nums[i]==13){
			break;
		}
		n +=nums[i];
		
	}
	
	System.out.println("the sum of numbers " +n);
		
	return n;*/
	int sum = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(nums[i] == 13)
			i++; //here in this probelm we should not add 13 and  the next number after 13 so i'm
		 //incrementing i by 1
		else
			sum += nums[i];
	}
	return sum;
}
}
