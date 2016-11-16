package arrays.interviewquestions;

public class No23 {
public static void main(String[] args){
	
}
public static boolean no23(int[] nums){
	if(nums[0] == 2 || nums[0] == 3)
		return false;
	return !(nums[1] == 2 || nums[1] == 3);
	
}
}
