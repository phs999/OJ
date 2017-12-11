package company.huawei;

import java.util.Scanner;

/*
 * [编程|100分] 求第二大整数值
时间限制：C/C++ 3秒，其他语言 6秒
空间限制：C/C++ 32768K，其他语言 65536K
题目描述
5个朋友在抢红包，每个人抢到的红包均为正整数，求手气第二好的人抢到的金钱数。
输入描述:
输入5行，每行均为正整数,且不大于100
输出描述:
输出一行，输出结果值
示例1
输入

11
22
33
44
55
输出

44
 */
public class Huawei005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp;
		int[] a = new int[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<4;j++) {
			for(int k=j;k<4;k++) {
				if(a[k+1]>a[j]) {
					temp=a[j];
					a[j]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		
		System.out.println(a[1]);
	}

}
