package company.huawei;

import java.util.Scanner;

/*
 * [编程|300分] 仿LISP字符串运算
时间限制：C/C++ 3秒，其他语言 6秒
空间限制：C/C++ 32768K，其他语言 65536K
题目描述
LISP语言唯一的语法就是括号要配对。
形如 (OP P1 P2 ...)，括号内元素由单个空格分割。
其中第一个元素OP为操作符，后续元素均为其参数，参数个数取决于操作符类型
注意：参数 P1, P2 也有可能是另外一个嵌套的 (OP P1 P2 ...)
当前OP类型为 quote / reverse / search / combine 字符串相关的操作：
- quote: 引用一个字符串，即返回字符串本身内容
参数个数 1
- reverse: 把字符串反转，并返回
参数个数 1
- search: 在第一个字符串中查找第二个字符串的第一次出现，返回从这开始到结束的所有字符串
如果查找不到，返回空字符串
参数个数 2
- combine: 把所有字符串组合起来
参数个数不定，但至少 1 个
其中P1, P2 等参数可能是带双引号的字符串,如 "abc"，也有可能是另外一个 (OP P1 P2 ...)
上述字符串包括引号；引号中间的所有字符，均为 ASCII 可打印字符，且不会再出现引号 (")
输出也为带双引号的字符串
举例:
输入字符串 输出结果
(quote "!@#$%") "!@#$%"
(reverse "a b c") "c b a"
(search "abcdef" "cd" ) "cdef"
(search "abcdef" "xy" ) ""
(combine "a" "b" "cde) ") "abcde) "
(search (combine "1234567890" "abcdefgh" "1234567890") (reverse "dc")) cdefgh123456789
输入描述:
合法C字符串，字符串长度不超过512；用例保证了无语法错误.
输出描述:
合法C字符串，需要带括号
示例1
输入

(search "huawei" "we")
输出

"wei"
 */
public class Huawei007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sar = s.split(" ");
		
		for(int i=sar.length-2;i>=0;i--) {
			if(sar[i].equals("(quote")) {
				continue;
			}
			if(sar[i].equals("(reverse")) {
				continue;
			}
			if(sar[i].equals("(search")) {
				continue;
			}
			if(sar[i].equals("(combine")) {
				continue;
			}
			if(sar[i].equals(" ")) {
				continue;
			}
			else {
				continue;
			}
			
		}
		
	}
	
	public static void quote(String[] sar,int i) {

	}
	public static void reverse(String[] sar,int i) {

	}
	public static void search(String[] sar,int i) {

	}
	public static void combine(String[] sar,int i) {
		int p=i+1;
		while(!sar[p].equals("(quote") && !sar[p].equals("(reverse") && !sar[p].equals("(search")) {
			sar[i]=""
		}
	}

}
