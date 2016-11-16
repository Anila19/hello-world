package arrays.interviewquestions;

public class Sum2 {
public static void main(String[] args){
	int[] nums ={1,1,2};
	sum2(nums);
}
public static int sum2(int[] nums){
	int sum  = nums.length;
	//System.out.println(sum);
	if(nums.length ==0){
		return 0;
	}
	else if(nums.length<2){
		return nums[0];
	}
	else if(nums.length>=2)
	sum = nums[0]+nums[1];
	System.out.println("the value of sum " +sum);
	return sum;
	
	
	
}
}
