package chap03;

import java.util.Random;

public class APIExam {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("������ => " + rand.nextInt(100));
		
		System.out.println("������ => " + rand.nextInt());
		
	}

}

//     ^          ^
//    /  -- --- -- ]
//   |      |\|     ]
//  <  \  O		O    >
//	//		 ?		]
// / 				))	
///		  3	   		3
///					
////			\\	\\
////////\
 // = = = = == = = ===