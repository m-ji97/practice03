package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		int count = 0;
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		System.out.print("5의 배수의 개수 : ");
		for(int i=1; i<=num; i++) {
			if(i%5==0) {
				i++;
				System.out.println(a+"개");
			}
			
		}
		
		System.out.print("5의 배수의 합계 : ");
		for(int i=1; i<=num; i++) {
			if(i%5==0) {
				count=count+i;
			}
		}
		System.out.println(count);
		
		
	}

}
