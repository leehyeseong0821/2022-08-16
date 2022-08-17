package projectA16;

import java.util.Vector;

public class projectA1502 {

	public static void main(String[] args) {
		 
		Vector<Integer>v = new Vector<Integer>();
//		자료추가
		v.add(5);
		v.add(4);
		v.add(-1);
//		중간에 자료추가
		v.add(2,100);
		for(int i=0;i<v.size();i++) {
			int n =v.get(i);
			System.out.println(n);
		}
		System.out.println("-------");
		for(Integer i:v) {
			System.out.println(i);
		}
			int sum=0;
			for(int i=0;i<v.size();i++) {
				int n = v.elementAt(i);
				sum= sum +n;
			}
			System.out.println(sum);
		}
	

}
