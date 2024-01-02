package com.javaex.practice;

public class Ex18 {
	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("최대값을 입력하세요 : ");
		int j = sc.nextInt();

		for (int i = 1; i <= j; i++){
			if (i%5==0){
				count++;
				sum = sum + i;
			}
		}
		System.out.println("5의 배수의 개수 : " + count);
		System.out.println("5의 배수의 합 : " + sum);

	}

}
