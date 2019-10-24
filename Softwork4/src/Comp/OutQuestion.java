package Comp;

import java.io.PrintStream;

public class OutQuestion {

	// 随即提供操作数

	Signal n1 = new Signal();
	Signal n2 = new Signal();

	// 随机提供运算符号

	OperateSig op = new OperateSig();

	// 剔除重复算式
	Del Fun = new Del();

	// x 取值范围 n 生成题目数量 Sig 判断是否包含负数 flag 判断运算法则 ifres 判断是否需要输出答案
	int qf, ts, Sig, flag, ifres;
	double Num1, Num2, Res;
	char OP;

	void getQuestion() {
			//随机生成算式
			Num1 = n1.RandomSig(qf, Sig);
			Num2 = n2.RandomSig(qf, Sig);
			OP = op.OperateSig(flag);
			
			Fun.Del(Num1, OP, Num2);//剔除重复算式
			//获取答案
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
			System.out.println("结果超出范围！");

		}
	}
}
