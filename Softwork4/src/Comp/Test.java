package Comp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		// 输出到外部文件

		PrintStream ps = new PrintStream("E:\\软件工程作业/question.txt");
		PrintStream rs = new PrintStream("E:\\软件工程作业/result.txt");

		OutQuestion outQ = new OutQuestion();

		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("请输入取值范围x:");
			outQ.qf = reader.nextInt();
			// 控制取值范围
		} catch (Exception e) {
			System.out.println("请输入正确的取值范围");// TODO: handle exception
		}

		try {
			System.out.println("请输入生成题目数量：");
			outQ.ts = reader.nextInt();
			// 控制题目数量
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("请输入正确的题目数量");
		}

		try {
			System.out.println("是否包含负数（1=是，0=否）：");
			outQ.Sig = reader.nextInt();
			// 控制正负
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("请输入1或0");
		}

		try {
			System.out.println("生成四则运算或二则运算（不包含乘除法）：（4=四则，2=二则）：");
			outQ.flag = reader.nextInt();
			// 控制运算法则
		} catch (Exception e) {
			System.out.println("请输入2或4");// TODO: handle exception
		}
		try{
		System.out.println("是否输出答案（1=是，0=否)：");
		outQ.ifres = reader.nextInt();
		// 控制答案的输出
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("请输入1或0");
		}
		for (int i = 0; i < outQ.ts; i++) {

			System.setOut(ps);
			outQ.getQuestion();
			System.setOut(rs);
			outQ.getResult();

		}

		// TODO Auto-generated method stub

	}

}
