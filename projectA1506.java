package projectA16;

import java.util.HashMap;
import java.util.Scanner;

public class projectA1506 {

	public static void main(String[] args) {
		 HashMap<String,String>dic = new HashMap<>();
		 dic.put("baby", "아기");
		 dic.put("love", "사랑");
		 dic.put("apple", "사과");
		 
		 Scanner in = new Scanner(System.in);
		 while(true) {
			 System.out.println("찾고 싶은단어는?");
			 String eng = in.nextLine();
			 if(eng.equals("exit")) {
				 System.out.println("프로그램 종료");
				 break;
			 }
			 String kor =dic.get(eng);
			 if(kor ==null) {
				 System.out.println(eng+"없는 단어입니다.");
			 }else {
				 System.out.println(kor);
			 }
		 }
		 
		 in.close();
	}

}
