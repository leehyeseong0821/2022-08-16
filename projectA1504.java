package projectA16;

import java.util.ArrayList;
import java.util.Scanner;

public class projectA1504 {

	public static void main(String[] args) {
		 
		ArrayList<String>a = new ArrayList<String>();
		Scanner in =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("이름을 입력하세요>>");
			String s = in.nextLine();
			a.add(s);
		}

		for(String sa:a) {
			System.out.println(sa+" ");
		}
		int longestIndex =0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length()) {
				longestIndex =i;
			}
		}
		System.out.println("\n가장 긴 이름은:"+a.get(longestIndex));
		in.close();
	}

}
