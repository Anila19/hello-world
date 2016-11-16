package collections.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class CheckSum {
public static void main(String[] args){
	
}
public static void printparis(int[] ar,int num){
	Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
	for(int i =0;i<ar.length;i++){
		if(mp.containsKey(ar[i])){
			System.out.println(ar[i] + " "+mp.get(ar[i]));
		}
		else{
			mp.put(num-ar[i],ar[i]);
		}
	}
}
}
