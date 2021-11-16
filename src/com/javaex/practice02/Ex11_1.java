package com.javaex.practice02;

import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		
		System.out.print("알파벳: ");
		String alp = sc.next();
		
		switch (alp) {
			case "a": 
			case "e": 
			case "i": 
			case "o": 
			case "u": {
				System.out.println("모음입니다.");
				break;
			}
			
        default :  {
				System.out.println("자음입니다.");
				break;
			}
		}
		
//		if (alp.equals("a")|| alp=="e"|| alp=="i"|| alp=="o"|| alp=="u"){
//			System.out.println("모음입니다.");
//		}
//		else {
//			System.out.println("자음입니다.");
//		}
		
		// 기본형이 아닌 string은 == 이 부호가 먹히지 않음 그래서 if (alp.equals("a")) 이런 식으로 써줘야 
		// 하는데 굳이 이렇게 쓸 필요x
		

	
		sc.close();


	}

}
