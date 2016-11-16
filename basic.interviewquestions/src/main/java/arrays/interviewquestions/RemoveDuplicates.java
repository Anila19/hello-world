package arrays.interviewquestions;

public class RemoveDuplicates {
public static void main(String[] args){
	int ar[] = {2,3,1,4,1,2};
int[] result = 	removeDuplicates(ar);


}
public static int[] removeDuplicates(int[] arr){
	int end = arr.length;

    for (int i = 0; i < end; i++) {
        for (int j = i + 1; j < end; j++) {
            if (arr[i] == arr[j]) {                  
                int shiftLeft = j;
                for (int k = j+1; k < end; k++, shiftLeft++) {
                    arr[shiftLeft] = arr[k];
                }
                end--;
                j--;
            }
        }
    }

    int[] whitelist = new int[end];
    for(int i = 0; i < end; i++){
        whitelist[i] = arr[i];
        System.out.println("yhe whitlist array " +whitelist[i]);
    }
    return whitelist;
}
}

 class Duplicates{
public static void main(String[] args){
	int[] ar = {2,1,3,1,4,2};
	int[] noduplicates = remove(ar);
}
public static  int[] remove(int[] ar){
	int end = ar.length;
	for(int i =0;i<end;i++){
		for(int j =i+1;j<end;j++){
			if(ar[i]==ar[j]){
				int shiftleft = j;
				for(int k = j+1;k<end;k++,shiftleft++){
					ar[k] = ar[shiftleft];
				}
				end--;
				j--;
			}
		}
	}
	int[] removedDuplicates = new int[end];
	for(int i =0;i<end;i++){
		removedDuplicates[i]= ar[i];
		System.out.println(removedDuplicates[i]);
	}
	return removedDuplicates;
}
}
