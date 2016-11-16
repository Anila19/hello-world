package arrays.interviewquestions;

public class BinarySearch {
public static void main(String[] args){
	int[] ar= {45,2,67,1,98,5};
	int key = 5;
	int result = search(ar,key);
	if(result!=-1){
		System.out.println("key "+key + "key found at index " +result);
	}
	else{
		System.out.println("key does not found");
	}
}
public static int search(int[] ar,int key){
	BubbleSort.sort(ar);
	BubbleSort.print(ar);;
	int low =0;
	int high = ar.length-1;
	while(low<=high){
		int middle = (low+high)/2;
		//System.out.println(middle);
		if(key==ar[middle]){	
		return middle;
		}
		else if(key<ar[middle]){
			high = middle-1;	
		}
		else
			low = middle+1;
		
	}
	return -1;
}
}

class Binary1{
	public static void main(String[] args){
		int[] ar ={23,45,67,22}; 
		int key = 3;
		int result = search(ar,key);
		if(result!=-1){
			System.out.println("key found "+key+ "at index " +result);
		}else{
			System.out.println("key doesnot found!!");
		}
	}
	public static int search(int[] ar ,int key){
		int start =0;
		int end = ar.length;
		
		while(start<end){
			int mid = start+end/2;
			if(ar[mid]==key){
				return mid;
			}
			if(key<ar[mid]){
				end = mid-1;
				
			}else
				start = mid+1;
		}
		return -1;
	}
}
