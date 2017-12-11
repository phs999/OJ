package company.huawei;

import java.util.Scanner;

/*
 * [编程|200分] 计算ISBN识别码
时间限制：C/C++ 3秒，其他语言 6秒
空间限制：C/C++ 32768K，其他语言 65536K
题目描述
一本正式出版的图书都有一个ISBN号码与之对应，ISBN码包括9位数字、1位识别码和3位分隔符，其规定格式如“x-xxx-xxxxx-x”，其中符号“-”是分隔符（键盘上的减号），最后一位是识别码，例如0-670-82162-4就是一个标准的ISBN码。ISBN码的首位数字表示书籍的出版语言，例如0代表英语；第一个分隔符“-”之后的三位数字代表出版社，例如670代表维京出版社；第二个分隔之后的五位数字代表该书在出版社的编号；最后一位为识别码。识别码的计算方法如下：
首位数字乘以1加上次位数字乘以2……以此类推，用所得的结果mod 11，所得的余数即为识别码，如果余数为10，则识别码为大写字母X。例如ISBN号码0-670-82162-4中的识别码4是这样得到的：对067082162这9个数字，从左至右，分别乘以1，2，…，9，再求和，即0×1+6×2+……+2×9=158，然后取158 mod 11的结果4作为识别码。
你的任务是编写程序根据输入的ISBN号码的前3段，计算出识别码，并输出完整的ISBN码。
输入描述:
为一个ASCII字符串。内容为ISBN码的前三段，以上面为例，就是0-670-82162。
输出描述:
若判断输入为合法的字符串，则计算出识别码，并输出完整的ISBN码；
若输入不合法，则输出字符串”ERROR”；

注意：最终交付的函数代码中不要向控制台打印输出任何无关信息。
示例1
输入

0-670-82162
输出

0-670-82162-4
 */
public class Huawei006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int n=0;
		if(c.length==11 && c[1]=='-' && c[5]=='-') {
			int[] number = new int[9];
			number[0]=(int)c[0]-48;
			number[1]=(int)c[2]-48;
			number[2]=(int)c[3]-48;
			number[3]=(int)c[4]-48;
			number[4]=(int)c[6]-48;
			number[5]=(int)c[7]-48;
			number[6]=(int)c[8]-48;
			number[7]=(int)c[9]-48;
			number[8]=(int)c[10]-48;
			for(int i=0;i<9;i++) {
				if(number[i]<10) {
					n+=(i+1)*number[i];
				}
				else {
					System.out.println("ERROR");
					return;
				}
			}
			
		}
		else {
			System.out.println("ERROR");
			return;
		}
		
		n=n%11;
		if(n==10) {
			System.out.println(s+"-X");
		}
		else {
			System.out.println(s+"-"+n);
		}
		
	}

}
