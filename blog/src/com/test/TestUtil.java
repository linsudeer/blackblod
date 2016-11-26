package com.test;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {
	/**
	 * int类型的最大值 0x7fffffff
	 */
	@SuppressWarnings("unused")
	private static final int INT_MAX = 2147483647;
	/**
	 * int类型的最小值 0x8fffffff
	 */
	@SuppressWarnings("unused")
	private static final int INT_MIN = -2147483648;
	
	/**
	 * 费氏数列
	 * @param num
	 * @return
	 */
	public static int fibonacciTheorem(int num){
		if(num<=0){
			return 0;
		}
		if(num == 1 || num == 2){
			return 1;
		}
		return fibonacciTheorem(num-1)+fibonacciTheorem(num-2);
	}
	
	/**
	 * 判断素数
	 * @param start 开始数值
	 * @param end 结束数值
	 * @return
	 */
	public static List<Integer> printPrime(int start,int end){
		List<Integer> primes = new ArrayList<Integer>();
		if(start>end){
			throw new IllegalArgumentException("参数错误，start>end");
		}
		for(int i=start;i<=end;i++){
			if(isPime(i)){
				primes.add(i);
			}
		}
		return primes;
	}
	
	/**
	 * 判断一个数是否是素数
	 * @param num
	 * @return
	 */
	public static boolean isPime(int num){
		if(num == 1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断水仙花数
	 * @param num
	 * @return
	 */
	public static boolean isNarcissus(int num){
		int sum = 0;
		int temp = num;
		while(temp>0){
			sum += Math.pow(temp%10,3);
			temp = temp/10;
		}
		if(sum == num){
			return true;
		}
		return false;
	}
	
	/**
	 * 打印水仙花数
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<Integer> printNarcissus(int start,int end){
		List<Integer> primes = new ArrayList<Integer>();
		if(start>end){
			throw new IllegalArgumentException("参数错误，start>end");
		}
		for(int i=start;i<=end;i++){
			if(isNarcissus(i)){
				primes.add(i);
			}
		}
		return primes;
	}
	
	/**
	 * 得到所有质因数
	 * @param num
	 * @return
	 */
	public static String getPrimie(int num){
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<=num;i++){
			while(num%i==0){
				sb.append("-").append(i);
				num = num/i;
			}
		}
		return sb.substring(1, sb.length());
	}
	
	/**
	 * 成绩
	 * @param num
	 * @return
	 */
	public static String getScore(int num){
		if(num > 100 || num <0){
			return "成绩无效";
		}
		return num>=90?"A":num>=60 && num <90?"B":"C";
	}
	
	/**
	 * 求两个数最大公约数(辗转相除法)
	 * @return
	 */
	public static int getMaxCommonDivisor(int num1,int num2){
		if(num1%num2==0){
			return num2;
		}
		return getMaxCommonDivisor(num2,num1%num2);
	}
	
	/**
	 * 求两个数的最小公倍数(分解质因数法)
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int getMinCommonMultiple(int num1,int num2){
		return num1*num2/getMaxCommonDivisor(num1, num2);
	}
}
