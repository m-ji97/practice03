package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		for (int no = 1; no<=100; no++) {
			if(no%5==0 && no%7==0) {
				System.out.println(no);
				continue;
			}

		}
	}

}
