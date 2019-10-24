package Comp;

public class Del extends Signal {
	public Del() {
		// TODO Auto-generated constructor stub
	}

	public void Del(double Num1, char OP, double Num2) {

		double p[][] = new double[100][3];// 开辟静态数组，暂时存放操作数
		int k = 0; // 定义静态变量记录数组中录入元素个数
		int j; // 数组行下标
		while (k <= p.length) {

			for (j = 0; j < k; j++) {

				if (p[j][0] == Num1 && p[j][1] == Op && p[j][2] == Num2) {
					continue;

				}

				p[j][0] = Num1;
				p[j][1] = (double) Op;
				p[j][2] = Num2;

			}
			k++;
			Num1 = p[p.length - 1][0];
			Op = (char) p[p.length - 1][1];
			Num2 = p[p.length - 1][2];
		}

	}
}
