package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

// 폴더의 내부를 탐색
public class FileTest02 {
	public static void main(String[] args) {
		// c:\iot\iotest 폴더의 하위 폴더 및 파일을 출력
		//[출력형태]
		// a -----------[폴더]
		// b -----------[폴더]
		// ArrayTest01.java ----------- [파일: (파일의 사이즈 출력)]
		// . 
		// .
		// 마지막 접속한 날짜를 년 월 일의 형식으로 출력 (패턴: 기호를 조합해서 만든 문자열)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		File file1 = new File("c:/iot/iotest");
		File[] fileArr = file1.listFiles();
		for (File file : fileArr) {
			if(file.isDirectory()) {
				System.out.println(file.getName()+ "\t" +"--------------[폴더]");
			}else {
				System.out.println(file.getName() +"\t" + "--------------[파일: (" + file.length() + ")]:"
														+sdf.format(file.lastModified()));
			}
		}
		
	}

}
