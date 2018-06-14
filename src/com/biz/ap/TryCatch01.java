package com.biz.ap;

public class TryCatch01 {

	public static void main(String[] args) {
		String num1 = "30";
		String num2 = "40";
		
		// 문자열 덧셈
		System.out.println(num1 + num2); // 3040이 출력
		
		// 문자열형 숫자를 정수형으로 바꾸어서
		// 숫자 덧셈을 실행
		
		int intNum1 = Integer.valueOf(num1);
		int intNum2 = Integer.valueOf(num2);
		
		System.out.println(intNum1 + intNum2); // 70이 출력
		
		// 숫자로 변환했기 때문에 4칙연산이 모두 가능
		
		// num1과 num2에 다른 값을 할당
		num1 = "30 ";
		num2 = " 40";
		
		// try는 본체 내부의 코드를 실행하는 과정에서
		// exception이 발생하면
		// exception정보를 catch에 전달하고
		// catch() 메서드를 실행
		try {
			// 정수로 변환
			intNum1 = Integer.valueOf(num1);
			intNum2 = Integer.valueOf(num2);
			System.out.println(intNum1 + intNum2);
		} catch (Exception e) {
			// e 변수에 현재 발생된 exception정보를 담아온다
			// e 변수의 내용을 확인하면 어떤 exception이
			// 발생했는지를 알 수 있다.
			e.printStackTrace(); // java에서 기본으로 보여주는
							// exception메시지이다.
							// 이 메시지를 사용하지 않고
			// 우리만의 메시지 전달을 한다.
			System.out.println("다음과 같은 문제 발생");
			System.out.println(e.getMessage());
			
		}
	}

}
