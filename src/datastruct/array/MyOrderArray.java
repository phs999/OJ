package datastruct.array;
/*
 * function:有序数组封装,二分法查找
 */
public class MyOrderArray {
	private long[] arr;
	
	private int element;  //数组的有效长度
	
	public MyOrderArray(){
		arr = new long[50];
	}
	
	public MyOrderArray(int size){
		arr = new long[size];
	}
	
	/*
	 * 添加数据
	 */
	public void insert(long value){
		int i;
		for(i=0; i<element; i++){
			if(arr[i]>value){
				break;
			}
		}
		for(int j=element; j>i; j--){
			arr[j]=arr[j-1];
		}
		arr[i]=value;
		element++;
	}
	
	/*
	 * 显示/打印数组元素
	 */
	public void display(){
		System.out.print("[");
		for(int i=0; i<element; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
	
	/*
	 * 查找数值
	 */
	public int search(long value){
		int i;
		for(i=0; i<element; i++){
			if(arr[i]==value)
				break;
		}
		if(i==element)
			return -1;
		else
			return i;
	}
	
	/*
	 * 查找数值--根据索引
	 */
	public long get(int index){
		if(index>=element||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else
			return arr[index];
	}
	
	/*
	 * 二分法查找:出口+内部循环
	 */
	public int biSearch(long value){
		int low=0;
		int pow=element;
		int mid = 0;
		while(true){
			mid=(low+pow)/2;
			if(arr[mid]==value){
				return mid;
			}else if(low>pow){
				return -1;
				}
				else{
					if(arr[mid]>value){
						pow = mid-1;
					}else {
						low = mid+1;
					}
				}
		}
	}
	
	/*
	 * 删除数据
	 */
	public void delete(int index){
		if(index>=element||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else{
			for(int i=index; i<element-1; i++){
				arr[i]=arr[i+1];
			}
			element--;
		}
			
	}
	
	/*
	 * 更新数据
	 */
	public void update(int index,long value){
		if(index>=element||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else{
			arr[index]=value;
		}
	}
	
	/*
	 * 
	 */
}
