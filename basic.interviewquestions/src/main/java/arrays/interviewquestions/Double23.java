package arrays.interviewquestions;

public class Double23 {
public static void main(String[] args){
	int[] num = {1,2};
boolean result = 	 double23(num);

}
public static  boolean double23(int[] nums){
	if(nums.length == 2)
	{
		if(nums[0] == 2 && nums[1] == 2)
			return true;
		return (nums[0] == 3 && nums[1] == 3);
	}
	return false;
	
}
}
