package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
	
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++){
		if (x%i == 0)
		System.out.println(i+ " ");
			}
	sc.close();		
		}
	}

