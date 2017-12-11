package datastruct.array;
/*
 * function:使用自定义类封装数组，添加类方法实现数据操作（增删改等）
 */
public class MyArray {
	private long[] arr;
	
	private int element;  //数组的有效长度
	
	public MyArray(){
		arr = new long[50];
	}
	
	public MyArray(int size){
		arr = new long[size];
	}
	
	/*
	 * 添加数据
	 */
	public void insert(long value){
		arr[element] = value;
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
