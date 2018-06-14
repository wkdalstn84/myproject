package com.biz.ap;
/*
 * data.txt 파일을 읽어서
 * 한줄씩 콘솔에 표시해 보기
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) {
		
		// 1. 파일을 열기
		// 2. 열린 파일 정보를 BufferedReader에 연결
		// 3. BufferedReader로 부터 문자열을 읽고
		// 4. 콘솔에 표시
		// 5. 파일을 닫기
		
		// 열어서 읽을 파일의 경로와 파일명을 변수에 설정
		String fileName = "src/com/biz/ap/data.txt";
		
		// FileReader 클래스가 생성되면서
		// 실제 물리적 파일을 open 하는데,
		// 어떤 이유로든 파일이름이 변경되거나, 삭제되거나
		// 또는 누군가 open 한 후에 close를 하지 않았을경우
		// 시스템 exception이 발생을 한다.
		// 이런경우 java는 개발자에게 이 코드의 exception 처리를
		// 강제하도록 한다.
		// 이때 exception처리를 exception handling이라고 한다.
		try {
			// 파일 열기
			FileReader fileReader = new FileReader(fileName);
			// fileReader에는 파일에 정보, 코드정보등이 저장되어 있다.
			
			// fileReader가 가지고 있는 정보를 BufferedReader에 연결
			BufferedReader buffer = new BufferedReader(fileReader);
			// 이때 BufferedReader는 fileReader 통로를 통해
			// data.txt 파일의 내용을 "모두 읽어들여"
			// 문자열 형태로 보관을 한다.
			// 단, data.txt 파일이 어느크기를 넘어가면
			// 일정한 크기단위로 잘라서 읽어 들인다.
			
			//이제부터 buffer로부터 문자열을 읽기 하면된다.
			
			// buffer로부터 문자열을 읽어서 저장할 String "객체"를 생성
			String line = "";
			line = new String(); // 파일로 부터 읽어 저장할 변수는
					// 일반 형태가 아닌 객체형태로 생성해주는 것이 좋다.
			
			while(true) {
				// 문자열 한줄을 읽기
				line = buffer.readLine();
				// 파일을 다 읽은 후
				// 내용이 없는 부분을 읽기하면
				// null 값을 return한다.
				// line 값이 null이면 읽기 중단
				if(line == null) break;
				System.out.println(line);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// 기본메시지를 삭제
			// e.printStackTrace(); // 메시지를 보여주고 프로젝트를
									// 중단해 버린다.
									// 그래서 기본메시지를 삭게하고
									// 별도의 메시지표시나 처리를 해준다.
			System.out.println("파일을 여는데 문제 있습니다.");
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("파일 읽기 과정에서 문제 발생!!");
		}
	}
}
