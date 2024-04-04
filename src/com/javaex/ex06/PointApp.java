package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); // false
		System.out.println(p2 == p3); // false
		System.out.println(p3 == p4); // false
		System.out.println(p4 == p1); // true
		System.out.println(p1.equals(p2)); // false
		System.out.println(p4.equals(p1)); //true
//	p1과 p2는 데이터 값이 같아도 참조하고 있는 주소가 다르기 때문에
//	결과는 false가 나온다.

//	equals(Object o)는 Object 클래스 내의 메서드 이기 때문이다.
	
	}

}


