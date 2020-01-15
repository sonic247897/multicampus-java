package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//InputStream을 이용해서 키보드로 입력받는 문자열을 읽기
// - Scanner클래스의 next메소드의 기능을 직접 구현
public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in; //in상수의 타입과 같은 타입으로 선언
		PrintStream out = System.out;
		
		while(true) {
			// 1. 스트림의 데이터를 1byte 읽기
			try {
				int data = in.read();
				// if(data==-1)
				if(data == 13) {
					break;
				}
				// 13번 - carriage return (엔터)
				// 10번 - Line feed (커서 앞으로 당기기)
				//out.println(data);
				out.print((char)data); 
				//한글(2byte) 깨진다- 한 byte씩 읽어서 조합하려고 하면 깨짐
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
