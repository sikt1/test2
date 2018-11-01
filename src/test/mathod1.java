package test;

public class mathod1 {

	public static void main(String[] args) {

		teiangle1 tri = new teiangle1();
		tri.setWidth(5);
		tri.setheight(4);
		System.out.println("삼각형의 한변의 길이  : " + tri.getWidth());
		System.out.println("삼각형의 한변의 길이  : " + tri.getheight());
		System.out.println("삼각형의 넓이 : " + tri.calc());
	}
 

}
