package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 숫자: ");
		int num1 = sc.nextInt();
				
		System.out.print("두번쨰 숫자: ");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			int dvs1 = num1/num2;
			int per1 = num1%num2;
			
			System.out.println("몫: "+dvs1);
			System.out.println("나머지: "+ per1);
		}
		else {
			int dvs2 = num2/num1;
			int per2 = num2%num1;
			
			System.out.println("몫: "+dvs2);
			System.out.println("나머지: "+ per2);
		}

		
		
		sc.close();

	}

}
