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

		// ������ⲿ�ļ�

		PrintStream ps = new PrintStream("E:\\���������ҵ/question.txt");
		PrintStream rs = new PrintStream("E:\\���������ҵ/result.txt");

		OutQuestion outQ = new OutQuestion();

		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("������ȡֵ��Χx:");
			outQ.qf = reader.nextInt();
			// ����ȡֵ��Χ
		} catch (Exception e) {
			System.out.println("��������ȷ��ȡֵ��Χ");// TODO: handle exception
		}

		try {
			System.out.println("������������Ŀ������");
			outQ.ts = reader.nextInt();
			// ������Ŀ����
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��������ȷ����Ŀ����");
		}

		try {
			System.out.println("�Ƿ����������1=�ǣ�0=�񣩣�");
			outQ.Sig = reader.nextInt();
			// ��������
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("������1��0");
		}

		try {
			System.out.println("�������������������㣨�������˳���������4=����2=���򣩣�");
			outQ.flag = reader.nextInt();
			// �������㷨��
		} catch (Exception e) {
			System.out.println("������2��4");// TODO: handle exception
		}
		try{
		System.out.println("�Ƿ�����𰸣�1=�ǣ�0=��)��");
		outQ.ifres = reader.nextInt();
		// ���ƴ𰸵����
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("������1��0");
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
