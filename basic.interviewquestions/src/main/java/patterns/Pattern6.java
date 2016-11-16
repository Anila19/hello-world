package patterns;
/*
1234
2341
3412
4123



*/
public class Pattern6 {
public static void main(String[] args){
	int k;
	for(int i =1;i<=4;i++){
		System.out.println();
		for(int j =1;j<=4;j++){
			k = i+j-1;//(i = 1 ; j =1 = 2,i =1,j = 2 =3) here j will increment
            // here i'm doing -1 because i need to decrement value by 1
			if(k>4){
		// here i'm using this logic because i'm comapring the value with 		
				k = k -4;
			}
			System.out.print(k);
		}
	}
}
}
