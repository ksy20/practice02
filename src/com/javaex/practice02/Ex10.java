package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		
		System.out.print("사번: ");
		int num = sc.nextInt();
		int team = num%3;
		
		if (team==0||num==0) {
			System.out.println("A팀 입니다.");
		}
		
		else if (team==1) {
			System.out.println("B팀 입니다.");
		}
		
		else if(num<0) {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		else  {
			System.out.println("C팀 입니다.");
		}
		
		
		
		
		
		
		sc.close();
			
			
			

	}

}
