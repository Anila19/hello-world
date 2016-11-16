package patterns;

/*****
****
***
**
*
*/
public class Pattern2 {
public static void main(String[] args){
	int startcount = 5;
	for(int i =1;i<=5;i++){
		System.out.println();
		for(int j = 1;j<=startcount;j++){
			System.out.print("*");
		}
		startcount--;
	}
}
}
