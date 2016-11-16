package arrays.interviewquestions;

public class BubbleSort {
public static void main(String[] args){
	int[] ar = {8,3,6,1,9,2};
	int[] num = sort(ar);
	for(int i =0;i<num.length;i++){
		System.out.println(num[i]);
	}
}

public static int[] sort(int[] ar){
	for(int i =1;i<=ar.length;i++){
		for(int j=0;j<ar.length-i;j++){
			if(ar[j]>ar[j+1]){
				int temp = ar[j];
				ar[j]= ar[j+1];
				ar[j+1]= temp;
			}
		}
	}
	return ar;
}
public static void print(int[] ar){
	for(int i =0;i<ar.length;i++){
		System.out.println("the sorted array values  "+ ar[i]);
	}
}
}
