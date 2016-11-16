package patterns;
/*


****
*  *
*  *
****



*/
public class Pattern5 {
public static void main(String[] args){
for(int i =1 ;i<=4;i++){
	System.out.println();
	for(int j =1;j<=4;j++){
		if(i==1||i ==4||j==1||j==4){
			System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
	}
}
}
}
