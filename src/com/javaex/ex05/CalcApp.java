package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int r=0;
    	
    	while(true) {
    		System.out.print(">>");
    		String line=scanner.next();
    		
    		if(line.equals("/q")) {
    			System.out.println("종료합니다");
    			break;
    		}
    		
    		String[] data = line.split(" ");
    		int num1 = Integer.parseInt(data[0]);
    		String op= data[1];
    		int num2 = Integer.parseInt(data[2]);
    		
    		switch(op) {
    		case "+":
    			Add add = new Add();
    			add.setValue(num1, num2);
    			r = add.calculate();
    			System.out.println(">>"+r);
    			break;
    		
    		case "-":
    			Sub sub = new Sub();
    			sub.setValue(num1, num2);
    			r= sub.calculate();
    			System.out.println(">>"+r);
    			break;
    			
    		case "*":
    			Mul mul = new Mul();
    			mul.setValue(num1, num2);
    			r=mul.calculate();
    			System.out.println(">>"+r);
    			break;
    			
    		case "/":
    			Div div = new Div();
    			div.setValue(num1, num2);
    			r=div.calculate();
    			System.out.println(">>"+r);
    			break;
    		
    		default:
    			System.out.println("알 수 없는 연산입니다.");
    		}
    		
    		
    	}
    	scanner.close();
    }
}
