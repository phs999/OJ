package lanqiao.digui;
/*
 * time:2017/1/26
 * author:phs
 * fuction:递归解决组合问题
 * 		从n个球中取出m个球，有多少种取法。(递归方法)
 * 思路：假设其中一个普通球为特殊球，则取球的情况分为两种：
 * 	一种是含有特殊球的，另一种是不含特殊球的
 *  f(n-1,m-1)   f(n-1,m)
 */
public class Quqiu {

	public static int f(int n,int m){
		if(n<m)return 0;				//出口主要结合下面相似体的逻辑写
		if(n==m)return 1;
		if(m==0) return 1;
		return f(n-1, m-1)+f(n-1, m); //认为想象出一个特殊球，将取球情况人为分成了两种：
									//一种是含有特殊球的情况，另一种是不含特殊球的情况
	}
	public static void main(String[] args) {
		int k = f(10,3);
		System.out.println(k);
	}

}
