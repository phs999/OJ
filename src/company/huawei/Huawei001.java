package company.huawei;

import java.util.Scanner;

/**
 * 2017.11.23
 * 2017华为秋招笔试
 * @author phs
 *题目：海滩上有一堆桃子，m只猴子来分。第一只猴子把这堆桃子平均分为m份，多了一个，
 *这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成m份，又多了一个，
 *它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只、第m只猴子都是这样做的，
 *问海滩上原来最少有多少个桃子？
 *输入: 输入猴子个数m（3<=m<=9）
 *输出: 原来最少有多少个桃子
 *样例输入: 3 
 *样例输出: 25 
 */
public class Huawei001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int t=1;
		for(int i=0;i<m;i++) {
			t=t*m;
		}
		System.out.println(t-m+1);

	}

}
