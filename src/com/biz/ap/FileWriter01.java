package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter는 없는 파일을 생성하고
 * 값을 기록하는 클래스
 * 
 * 이 클래스를 이용해서 임의 값을 기록해 보기
 */
public class FileWriter01 {

	public static void main(String[] args) {
		String fileName = "src/com/biz/ap/data1.txt";
		
		// 파일을 생성
		FileWriter fileWriter = null;
		
		// 실제로 파일을 기록할때
		// FileWriter와 중간에 보조역활을 할 Buffer 설정
		BufferedWriter buffer = null;
		
		try {
			// 기존에 data1.txt가 있으면
			// 삭제하고 새로 생성
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			for(int i = 0; i < 10; i++) {
				
				int num = (int)(Math.random() * 10);
				// 숫자를 문자열형 숫자로 바꾸기
				String strNum = String.valueOf(num);
			
				// write는 기록하고자 하는 data가
				// 정수형이면 char 로 기록한다.
				// 정수를 코드로 인식해서 "문자"로 기록한다.
				// 숫자를 제대로 보이게 기록하려면
				// 문자열로 바꾸어서 기록해야 한다.
				buffer.write(strNum);
				
				buffer.newLine(); // 다음줄로 enter 하라
			}
			// 파일을 write 할때는 반드시 닫아 줘야 한다.
			// 그렇지 않으면 buffer에 남아있는 데이터가
			// 미쳐 파일에 기록되지 않는 경우가 발생한다.
			
			// 파일을 write할때는 닫기전에 해야할 일이
			// 하나 더 있는데
			buffer.flush(); // buffer에 남아있는 데이터를
					// 파일로 안전하게 기록 완료하라
			
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "생성오류!!");
		}
		System.out.println("완료되었음");
		
	}

}
