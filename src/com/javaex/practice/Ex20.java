package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in); 
		boolean i = true;
		System.out.println("======================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("======================");
		while (i) {
			System.out.print(">>");
			int num1 = sc.nextInt();

			if(29>num1) {
				System.out.println("더 높게");

			}else if(29<num1){
				System.out.println("더 낮게");
			}else {
				System.out.println("맞았습니다");
				System.out.print("게임을 종료하겠습니까? (y/n) >>");
				String y = sc1.nextLine();
				System.out.println("===================");
				System.out.println("[숫자맞추기게임 종료]");
				System.out.println("===================");
				i=false;
			}
			

		}
		sc.close();
		sc1.close();
	}
}