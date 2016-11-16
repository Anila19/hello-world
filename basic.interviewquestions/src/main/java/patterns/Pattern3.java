package patterns;
/*
1
12
123
1234
12345
12345
1234
123
12
1



*/
public class Pattern3 {
public static void main(String[] args){
	int max =1;
	for(int i =1;i<=5;i++){
		System.out.println();
		for(int j = 1;j<=max;j++){
			System.out.print(j);
		}
		max++;
}
	for(int i =1;i<=5;i++){
		System.out.println();
		for(int j =1;j<max;j++){
			System.out.print(j);
		}
		max--;
	}
	
}
}