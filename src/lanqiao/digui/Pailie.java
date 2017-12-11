package lanqiao.digui;

import javax.print.attribute.standard.Chromaticity;

/*
 * time:2017/2/17
 * author:phs
 * fuction:用递归解决排列问题
 * 		求n个元素的全排列
 */
public class Pailie {
	public static int f1(int n){//求全排列总数
		if(n==0)return 1;
		return n*f1(n-1);
	}
	
	public static void f2(char[] a,int begin){ //打印输出所有全排列的情况
		if(begin==a.length-1){//不减一结果相同，需要进一步思考
			for (char c : a) {
				System.out.print(c);
			}
			System.out.println();
		}
		for(int i=begin;i<a.length;i++){
			char temp = a[begin];
			a[begin] = a[i];
			a[i] = temp;
			
			//if(begin==a.length-1)continue;
			f2(a, begin+1);
			temp = a[begin];
			a[begin] = a[i];
			a[i] = temp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = f1(3);  //求全排列总数
		System.out.println(k);
	
		char[] data = "abc".toCharArray();
		System.out.println("全排列的各种情况如下：");
		f2(data,0);

	}

}
