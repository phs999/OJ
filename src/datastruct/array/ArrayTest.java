package datastruct.array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		long k = scanner.nextLong();
		int[] array = new int[element+1];
		for(int i=0; i<element; i++){
			array[i] = scanner.nextInt();
		}
		for(long j=1; j<=k;j++){
			array[element]=array[0];
			for(int i=0;i<element;i++){
				array[i]+=array[i+1];
				if(array[i]>=100){
					array[i]=array[i]%100;
				}
			}
		}
		for(int i=0; i<element;i++){
			System.out.print(array[i]);
			if(i<element-1){
				System.out.print(" ");
			}
		}
		
	}

}
