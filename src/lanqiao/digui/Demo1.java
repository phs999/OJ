package lanqiao.digui;

import javax.security.auth.x500.X500Principal;
/*
 * time:2017/1/26
 * author:phs
 * fuction:
 * 		递归打印数字的三种方法
 * 		递归求数组和的三种方法
 */
public class Demo1 {
	//打印1~10
	public static void f1(int n){
		if(n>0){
			f1(n-1);
		}
		System.out.println(n);
		
	}
	//打印10~1
	public static void f2(int n){
		if(n>-1){
			System.out.println(n);
			f2(n-1);
		}
	}
	//打印begin~end
	public static void f3(int begin,int end){
		if(begin<=end){
			System.out.println(begin);
			f3(begin+1,end);
		}
	}
	//递归求数组和方法1： (.+[.+[...]]),只考虑当前a[begin]和后面的和相加，其他的不管。数组最后项(begin=a.length-1)的a[begin]与0相加
	public static int f4(int a[],int begin){
		if(begin == a.length) return 0;
		int x = f4(a, begin+1);
		return x+a[begin];
	}
	//递归求数组和方法2：([[...]+.]+.),只考虑当前a[end]和前面的和相加，其他的不管。递归最后项(end=0)数组的a[end]与0相加
	public static int f5(int[] a,int end){
		if(end==-1)return 0;
		int x=f5(a, end-1);
		return x+a[end];
	}
	//递归求数组和方法3：折半求和[begin,mid)+[mid,end)
	public static int f6(int[] a,int begin,int end){
		if(begin+1==end){
			return a[begin];
		}
		int mid=(begin+end)/2;
		return f6(a, begin, mid)+f6(a, mid, end);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("打印1~10:");
		f1(10);
		System.out.println("打印10~1:");
		f2(10);
		System.out.println("打印begin~end:");
		f3(1, 11);
		
		int a[]={1,3,2,45,13,90};
		int sum1=f4(a,0);
		System.out.println(sum1);
		int sum2=f5(a, a.length-1);
		System.out.println(sum2);
		int sum3=f6(a, 0,a.length);
		System.out.println(sum3);

	}

}
