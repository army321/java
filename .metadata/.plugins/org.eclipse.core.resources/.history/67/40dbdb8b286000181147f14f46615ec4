package test;

import java.util.*;

public class example4_6 {
//StringTokenizer  本示例演示如何分割字符串，
//public StringTokenizer(String str,String delim)  
	public static void main(String[] args) {
		String s1 = " public static void , main、面/ffzmznzjjjzkkkzgggg";
		String s2 = " StringTokenizer pas2? = new StringTokenizer";
		StringTokenizer pas1 = new StringTokenizer(s1," ,、z");//空格逗号顿号做分隔符，这边填任意的字符都可以，
		StringTokenizer pas2 = new StringTokenizer(s2," ?");
		int n1 = pas1.countTokens(), n2 = pas2.countTokens();
		System.out.println("s1 有单词 ："  +n1 +"ge 单词如下：");
		while(pas1.hasMoreTokens()) {
			String s = pas1.nextToken();
			System.out.println(s);
		}
		System.out.println("s2 有单词 ："  +n2 +"ge 单词如下：");
		while(pas2.hasMoreTokens()) {
			String s = pas2.nextToken();
			System.out.println(s);
			
		}
		

	}

}
