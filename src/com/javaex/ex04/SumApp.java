package com.javaex.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// 코드를 작성하세요
		try {
			String[] s = numLine.split(" ");
			for (String s2 : s) {

				Integer i = Integer.valueOf(s2);
//			System.out.println(i);
				sum += i;
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("합:" + sum);

		sc.close();
	}

}
