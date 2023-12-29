package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int no1 = 0;
		int no2 = 0;

		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				no2=no2+i;
			}
		}
		for(int j=1; j<=num; j++) {
			if(j%2!=0) {
				no1=no1+j;
			}
		}
		if(num%2==0) {
			System.out.println("결과값: "+no2);
		} else {
			System.out.println("결과값: "+no1);
		}

		sc.close();

	}
}



