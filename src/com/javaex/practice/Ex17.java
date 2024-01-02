package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) { //행
			for(int j=num; j>i; j--) { //열
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
