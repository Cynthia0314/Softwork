
package Comp;

import java.util.Random;

//随机提供运算符号

public class OperateSig extends Arithmetic {
	int flag;
	char Op;
	Random rand = new Random();

	public OperateSig() {
		// TODO Auto-generated constructor stub
	}

	char OperateSig(int flag) {

		char c[] = { '+', '-', '*', '/' };
		switch (flag) {
		case 1:
		case 2:
			Op = c[rand.nextInt(2)];
			break;
		case 3:
		case 4:
			Op = c[rand.nextInt(4)];
			break;
		}
		return Op;

	}
}