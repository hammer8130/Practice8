package com.javaex.ex05_2;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Calc calcs[] = new Calc[4];
		calcs[0] = new Add();
		calcs[1] = new Sub();
		calcs[2] = new Mul();
		calcs[3] = new Div();
		CalcOp cop = new CalcOp();
		
		Scanner scanner = new Scanner(System.in);
		String userInput;
		int r;
		int calcId;
		
		boolean isCon = true;
		while(isCon) {
			System.out.print(">>");
			userInput = scanner.next();
			r=0;
			calcId=-1;
			
			if(userInput.indexOf("/q")!=-1) {
				isCon=false;
				System.out.println("종료합니다");
			}
			else {
				if(cop.sett(userInput)) {
				switch(cop.getOp()) {
				case '+':{
					calcId=0;
					break;
				}
				case '-':{
					calcId=1;
					break;
				}
				case '*':{
					calcId=2;
					break;
				}
				case '/':{
					if(cop.getNum2()>0) {
						calcId = 3;
					}else {
						System.out.println("0이나 음수로는 나눌수 없습니다.");
					}
				}
				
			}
		}
		}

		}
	}

}
