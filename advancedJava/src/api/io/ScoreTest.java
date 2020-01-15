package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.midi.Soundbank;

public class ScoreTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		int total =0, count=0;
		double avg = 0;
		try {
			br= new BufferedReader(new FileReader("src/data/score.txt"));
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				++count;
				/*String str1 = data.substring(0, data.indexOf(","));
				String str2 = data.substring(data.indexOf(" ")+1);
				System.out.println(str1 +"의 점수는 "+str2 +"점");
				int score = Integer.parseInt(str2);
				total += score;*/
				
				String[] dataArr = data.split(",");
				total += Integer.parseInt(dataArr[1]);
				System.out.println(dataArr[0]+"의 점수는 "+dataArr[1]+"점");
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		avg = total/count;
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);

	}
}
