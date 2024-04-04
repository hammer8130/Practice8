package com.javaex.ex05_2;

public class CalcOp {
	private int num1;
	private int num2;
	private Character op;

	public boolean sett(String ex) {
		String[] splits;
		searchOp(ex);

		if (op == '!') {
			return false;
		}

		splits = ex.split("\\" + op.toString());
		splits[0] = splits[0].trim();
		splits[1] = splits[1].trim();

		try {
			num1 = Integer.parseInt(splits[0]);
			num2 = Integer.parseInt(splits[1]);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private void searchOp(String ex) {
		if (ex.indexOf("+") != -1) {
			op = '+';
		} else if (ex.indexOf("-") != -1) {
			op = '-';
		} else if (ex.indexOf("/") != -1) {
			op = '/';
		} else if (ex.indexOf("*") != -1) {
			op = '*';
		} else {
			op = '!';
		}
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public char getOp() {
		return op;
	}

}
