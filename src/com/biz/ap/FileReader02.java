package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * grade.txt 파일을 읽어서
 * 숫자들의 전체 합계를 계산하여 출력
 */
public class FileReader02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/grade.txt";
		
		// intSum 변수를
		// try 구분이 종료된 후에도 참조하려면
		// try 구문 이전에 선언, 생성해주어야 한다.
		int intSum = 0;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String line = new String();
			while(true) {
				line = buffer.readLine();
				if(line == null) break;
				int intNum = Integer.valueOf(line);
				intSum += intNum;
				
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// 여기에 코드가 없으면
			// 어떤 exception에 대한 것을 무시하라
			
			System.out.println("파일 내용중 숫자가 아닌 부분이 있음");
		}
		// try에서 오류가 발생하면 건너 뛰고 실행될 부분
		// 여기에 합계 표시 코드를 작성하면
		// 최소한 정상적인 숫자 부분에 대한 합계는 볼수 있다.
		System.out.println("합계 : " + intSum);
	}
}
