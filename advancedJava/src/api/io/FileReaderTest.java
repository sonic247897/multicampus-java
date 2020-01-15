package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 문자 단위로 읽어서 파일 input하기
public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		try{
			// 1. 파일 오픈하기
			fr = new FileReader("src/api/io/FileTest01.java");
			// 2. 파일 액세스
			int count = 0; //실행횟수
			long start = System.nanoTime();
			
			while(true) {
				int data = fr.read();
				if(data == -1) {
					break;
				}
				count++;
				// 한글 안깨짐!
				System.out.print((char)data);
			}
			long end = System.nanoTime();
			System.out.println("실행횟수=>"+count);
			System.out.println("실행시간=>"+(end-start));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 3. 파일닫기
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
