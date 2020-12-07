package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		//equals메소드는 Object클래스에서 선언되어 있으며, class는 기본적으로 Object클래스를 상속하도록 설정되어있으며, 생략이 가능하여 extends로 명시되어있지않다.
	}

}

/* 실행 결과 예상
 false
 false
 false
 true
 false
 true
 */
