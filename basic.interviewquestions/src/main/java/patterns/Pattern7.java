package patterns;

import org.jboss.netty.util.internal.SystemPropertyUtil;

public class Pattern7 {
public static void main(String[] args){
	int max = 1;
	for(int i =0;i<=4;i++){
		System.out.println();
		for(int k=3;k>=i;k--){
			System.out.print(" ");
		}
		for(int j =1;j<=max;j++){
			System.out.print(j);
			
		}
		max++;
	}
}
}
