package api.io;

import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		// 액세스하고 싶은 파일이나 폴더의 위치를 File객체 만들 때 매개변수에 정의
		// 1. c:\iot\iotest 폴더
		// \는 문자로 못 쓴다.(escape sequene로 사용되므로)
		// \문자 사용하려면 \\로 써야함(escape sequence로)
		//File file1 = new File("c:\\iot\\iotest");
		// 	<절대경로> 잘 안 쓴다.
		File file1 = new File("c:/iot/iotest"); // \대신 /사용하는 방법도 지원
		
		// 2. 프로젝트 폴더에 저장한 test.txt 파일
		//	=> 경로를 정의하지 않는 경우(파일명만 줌) 기본으로 인식하는 위치는 프로젝트 폴더
		File file2 = new File("test.txt");
		
		// 3. src/data폴더에 저장된 test.txt파일
		//	<상대경로>
		File file3 = new File("src/data/test.txt");
		
		// 각각 인식됨을 확인
		System.out.println(file1);
		System.out.println(file2);
		System.out.println(file3);
		
		System.out.println("file3.canRead() => " + file3.canRead());
		System.out.println("file3.canWrite() => " + file3.canWrite());
		System.out.println("file3.getName() => " + file3.getName());
		System.out.println("file3.getAbsolutePath() => " + file3.getAbsolutePath());
		System.out.println("file3.getParent() => " + file3.getParent());
		System.out.println("file3.getPath() => " + file3.getPath());
		System.out.println("file3.isDirectory() => " + file3.isDirectory());
		System.out.println("file1.isDirectory() => " + file1.isDirectory());
		System.out.println("file3.isFile() => " + file3.isFile());
		System.out.println("file1.isFile() => " + file1.isFile());
		System.out.println("file3.isHidden() => " + file3.isHidden());
		// 1970.01.01에서 오늘 날짜까지의 일수
		System.out.println("file3.lastModified() => " + file3.lastModified());
		System.out.println("file3.length() => " + file3.length());
		file3.setReadOnly(); //읽기전용
		
	}

}
