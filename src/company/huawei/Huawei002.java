package company.huawei;

import java.util.Scanner;

/**
 * 
 * @author phs
 *	时间限制：1秒 空间限制：32768K 
	本题知识点： 字符串
	题目描述：字符串最后一个单词的长度
	计算字符串最后一个单词的长度，单词以空格隔开。 
	输入描述:
	一行字符串，非空，长度小于5000。
	输出描述:
	整数N，最后一个单词的长度。
	
	思路：存入数组，从最后一个数组元素开始遍历计数，但要考虑边缘情况，len=0
 */
public class Huawei002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();
		int len=c.length;
		int N=0;
		while(len>0&&c[len-1]!=' ') { 
			len--;
			N++;
		}
		System.out.println(N);
//		for(int i=len;i>=0;i--) {//i=0时 数组访问越界
//			if(c[i-1]!=' ') {
//				N++;
//			}
//			else {
//				System.out.println(N);
//				return;
//			}
//		}
		

	}

}
