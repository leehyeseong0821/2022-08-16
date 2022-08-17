package projectA16;

import java.util.Vector;

class point{
	private int x;
	private int y;
	public point(int x ,int y) {
		this.x=x;
		this.y=y;
	}
	@Override

	public String toString() {
		return "("+x+","+y+")";
		
	}
	
}



public class projectA1503 {

	public static void main(String[] args) {
		Vector<point> v = new Vector<point>();
		v.add(new point(2,3));
		v.add(new point(-5,20));
		v.add(new point(30,8));
		
		for(point p:v) {
			System.out.println(p);
		}
		System.out.println("---------");
		v.remove(1);
		for(point p:v) {
			System.out.println(p);
		}
		System.out.println("---------");
		for(int i=0;i<v.size();i++) {
			point p = v.get(i);
			System.out.println(p);
		}
			System.out.println("---------");
			for(int i=0;i<v.size();i++) {
				point p=v.elementAt(i);
				System.out.println(p);
			
		}

	}

}
