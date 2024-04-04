package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	//equals() 메소드를 작성하세요.
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj; //
//			if(p.x==x) {
//				return true;
//			}
//			else{
//				return false;
//			}
			return p.x==this.x;
		}
		return false;
		
	}
}
