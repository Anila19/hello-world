package arrays.interviewquestions;

import java.util.Arrays;

public class Has23 {
public static void main(String[] args){
	int[] nums = {1,4,1};
	 has23(nums);

}
public static boolean has23(int[] nums){
	if(Arrays.toString(nums).toString().contains("2")||Arrays.toString(nums).toString().contains("3")){
		System.out.println("im in if block");
	return true;
		
	}
	
	else
		System.out.println("i'm in else block");
		return false;
	
	
}
}