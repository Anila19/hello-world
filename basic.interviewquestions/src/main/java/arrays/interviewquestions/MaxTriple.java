package arrays.interviewquestions;

public class MaxTriple {
public static void main(String[] args){
	int [] triple ={1,2,3};
	int result = maxTriple(triple);
	System.out.println(result);
}
public static int maxTriple(int[] nums){
	int i;
	for( i =0;i<nums.length;i++){
	}
	if(nums[i]>nums[i+1]){
		
		return nums[i];
	}
	
	else{
		return nums[i+1];
	}
	
	
	
}
}
