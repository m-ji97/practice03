package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int inAmount = 0;
		boolean num01 = true;
		while (num01) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("----------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			

			switch (num) {
			case 1:
				System.out.print("예금액>");
				inAmount = sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				int i = sc1.nextInt();
				inAmount = inAmount - i;
				break;
			case 3:
				System.out.print("잔고액>");
				System.out.println(inAmount);
				break;
			case 4:
				System.out.println("프로그램 종료");
				num01=false;
				break;
				
			default:
				System.out.println("다시입력해주세요");
				break;
			}
		}
		sc.close();
		sc1.close();
		sc2.close();
		



	}

}
