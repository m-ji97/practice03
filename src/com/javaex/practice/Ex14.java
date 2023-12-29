package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		int sum01=0;
		int num=0;

		System.out.print("숫자를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for(int i=1; i<=num; i++) {
			sum01 = i+sum01;
			System.out.print(i);
			if(i!= num) {
				System.out.print("+");
			}else {
				System.out.println();
			}
		
		}
		System.out.print("합계: "+sum01);	
		
		sc.close();
	}
}
