package company.huawei;

import java.util.Scanner;

/**
 * 
 * @author phs
 *时间限制：1秒 空间限制：32768K
题目描述： 计算字符个数
写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
输入描述:
输入一个有字母和数字以及空格组成的字符串，和一个字符。
输出描述:
输出输入字符串中含有该字符的个数。
示例1
输入
ABCDEF A
输出
1
 */
public class Huawei003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int i=0;
		int count=0;
		char c1= sc.next().charAt(0);
		//char c1 = s[s.length-1];
		
		char c2;
		boolean b=Character.isUpperCase(c1);
		if(b) 
			c2=(char) (c1+32);
		else
			c2=(char)(c1-32);
		
		while(i<s.length-2) {
			if(s[i]==c2||s[i]==c1) {
				count++;
			}
			i++;
		}
		
		System.out.println(count);
		
	}

}
