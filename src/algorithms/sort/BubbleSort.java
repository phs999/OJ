package algorithms.sort;
/*
 * 冒泡排序：两层循环，外层选定特定一个数，内层将该数与其他的数进行比较并交换位置
 */
public class BubbleSort {
	static int temp;
	public static void arrayPrint(int[] array){
		System.out.print("[");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println("]");
		
	}
	public static void bSort(int[] array){
		for(int j = 0;j < array.length-1; j++){
			for(int i = array.length-1; i > j; i--){
				if(array[i]<array[i-1]){
					temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
				else{
					
				}
			}
		}
		
	
	}
	
	public static void main(String[] args){
		
		int[] array = {12,32,1,45,21,22,78,11};
		arrayPrint(array);
		bSort(array);
		arrayPrint(array);
	}
	
}
