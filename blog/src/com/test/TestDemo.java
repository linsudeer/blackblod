package com.test;

import java.util.List;

import junit.framework.TestCase;

public class TestDemo extends TestCase{
	
	/**
	 * 【程序1】(费氏数列)
	 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？ 
	 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21.... 
	 */
	public void test1(){
		int n=36;
		System.out.println("第"+n+"个月的兔子有"+TestUtil.fibonacciTheorem(n)+"对");
	}
	
	/**
	 * 【程序2】
	 * 题目：判断101-200之间有多少个素数，并输出所有素数。
	 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
	 */
	public void test2(){
		List<Integer> primes = TestUtil.printPrime(101,9000);
		System.out.println("共有"+primes.size()+"个素数，分别是："+primes.toString());
		
	}
	
	/**
	 * 【程序3】
	 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
	 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
	 */
	public void test3(){
		List<Integer> narcissus = TestUtil.printNarcissus(100,999);
		System.out.println("共有"+narcissus.size()+"个水仙花数，分别是："+narcissus.toString());
	}
	
	/**
	 * 【程序4】
	 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
	 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
	 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
	 * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
	 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
	 */
	public void test4(){
		int n = 100;
		System.out.println(n+"="+TestUtil.getPrimie(n).replaceAll("-", "*"));
	}
	
	/**
	 * 【程序5】
	 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
	 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。 
	 */
	public void test5(){
		int n = 59;
		System.out.println(TestUtil.getScore(n));
	}
	
	/**
	 * 【程序6】
	 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
	 * 程序分析：利用辗除法。
	 */
	public void test6(){
		int num1=30;
		int num2=45;
		System.out.println("最大公约数为"+TestUtil.getMaxCommonDivisor(num1, num2)+"最小公倍数为"+TestUtil.getMinCommonMultiple(num1, num2));
	}
	
	/**
	 * 【程序7】
	 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
	 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
	 */
	public void test7(){
		
	}

}
