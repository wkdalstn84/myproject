package com.biz.ap;

import java.util.Scanner;

/*
 * 키보드에서 숫자를 입력받아서
 * 입력받은 숫자들의 합을 구해서
 * 콘솔에 표시
 */
public class TryCatch02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intSum = 0; // 합계를 구할 변수
		
		while(true) {
			
			System.out.print("숫자>>");
			// 키보드에서 문자열 입력
			String str = scanner.nextLine();
			
			// 입력받은 문자열이 "~END"이면 종료하고
			// 값 출력
			if(str.equals("~END")) break;
			
			try {
				// 문자열을 숫자로 변환
				int intNum = Integer.valueOf(str);
				
				// 덧셈수행
				intSum += intNum;
				
			} catch (Exception e) {
				System.out.println("문자열을 숫자로 변환시키는 중");
				System.out.println("문제가 발생했습니다.");
				System.out.println("다시 입력해 주세요.");
			}
		}
		System.out.println("합계 : " + intSum);
	}
}
