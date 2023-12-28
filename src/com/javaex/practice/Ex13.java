package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		int sum=0;
		
		System.out.print("숫자를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		
		for (int i=0; i<=num1; i++) {
			sum=sum+i;
		}
		System.out.print("합계: "+sum);
		sc.close();
	}
}
