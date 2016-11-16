package arrays.interviewquestions;

public class FirstLast6 {
public static void main(String[] args){
int[] nums = {1,5,6};
boolean result = firstLast6( nums);
System.out.println(result);
}
public static boolean firstLast6(int[] nums){
	if(nums.length<0){
		return false;
	}
	if(nums[0]==6 ||nums[nums.length-1]==6){
		return true;
	}
	else{
		return false;
	}
}
}
