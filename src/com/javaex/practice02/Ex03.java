package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	  
		//예상) 21, 100 입력하였을때 1번 그룹, 15, 19, 20 입력하였을때 2번 그룹
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (age>20) {
			System.out.println("\"1번그룹\"");
		}
		
		else {
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");
		
		
		sc.close();

	}

}
