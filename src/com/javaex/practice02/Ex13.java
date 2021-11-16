package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		System.out.print("숫자: ");
		int x = sc.nextInt();
		
		double fx1 = (x*x*x)-(9*x)+2;
		double fx2 = (7*x)+2;
		
		if (x<=0) {
			System.out.println("계산결과는 "+fx1+" 입니다.");
		}
		
		else {
			System.out.println("계산결과는 "+fx2+" 입니다.");
		}
		
		
		
		sc.close();

	}

}
