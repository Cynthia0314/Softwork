package Comp;

import java.io.PrintStream;

public class OutQuestion {

	// �漴�ṩ������

	Signal n1 = new Signal();
	Signal n2 = new Signal();

	// ����ṩ�������

	OperateSig op = new OperateSig();

	// �޳��ظ���ʽ
	Del Fun = new Del();

	// x ȡֵ��Χ n ������Ŀ���� Sig �ж��Ƿ�������� flag �ж����㷨�� ifres �ж��Ƿ���Ҫ�����
	int qf, ts, Sig, flag, ifres;
	double Num1, Num2, Res;
	char OP;

	void getQuestion() {
			//���������ʽ
			Num1 = n1.RandomSig(qf, Sig);
			Num2 = n2.RandomSig(qf, Sig);
			OP = op.OperateSig(flag);
			
			Fun.Del(Num1, OP, Num2);//�޳��ظ���ʽ
			//��ȡ��
			Result result = new Result(Num1, OP, Num2, ifres);
			Res = result.getResult();

			if (Num1 >= 0) {
				System.out.print(Num1);
			} else {
				System.out.print("(" + Num1 + ")");
			}
			System.out.print(OP);
			if (Num2 >= 0) {
				System.out.println(Num2 + "=");
			} else {
				System.out.println("(" + Num2 + ")" + "=");
			}


	}

	void getResult() {
		if (Res < 100) {
			if (ifres == 0) {
				System.out.println("");
			} else {
				System.out.println(Res);
			}
		} else {
			System.out.println("���������Χ��");

		}
	}
}
