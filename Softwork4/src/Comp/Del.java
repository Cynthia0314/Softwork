package Comp;

public class Del extends Signal {
	public Del() {
		// TODO Auto-generated constructor stub
	}

	public void Del(double Num1, char OP, double Num2) {

		double p[][] = new double[100][3];// ���پ�̬���飬��ʱ��Ų�����
		int k = 0; // ���徲̬������¼������¼��Ԫ�ظ���
		int j; // �������±�
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
