package arrays.interviewquestions;

public class LinearSearch {
public static void main(String[] args){
	int ar[] = {45,23,78,9};
	int key = 9;
int result=	search(ar,key);
if(result!=-1){
	System.out.println("key found " +key+ "at index "+result);
}else{
	System.out.println("key doesnot found!!! ");
}
	
}
public static int search(int[] ar,int key){
	for(int i =0;i<ar.length;i++){
		if(ar[i] ==key){
			return i;
		}
	}
	return -1;
}
}
