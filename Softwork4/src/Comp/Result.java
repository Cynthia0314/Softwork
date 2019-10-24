package Comp;

public class Result extends Arithmetic {
	int ifres;
	double Result;

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(double Num1, char Op, double Num2, int ifres) {
		this.Num1 = Num1;
		this.Num2 = Num2;
		this.Op = Op;
		this.ifres = ifres;
	}

	double getResult() {
		Operation O=new Operation();
		double Result = 0;
		if (ifres==0) {
			System.out.println("");
		} 
		else /*if (Op == '/' && Num2 == 0)*/{
			
			//System.out.println("ERROR!");
			
			switch (Op) {
			case '+':
				O.Add(Num1, Num2);
				 Result = O.getAdd();//Num1 + Num2;
				break;
			case '-':
				O.Sub(Num1, Num2);
				 Result = O.getSub();//Num1 - Num2;
				break;
			case '*':
				O.Mul(Num1, Num2);
				 Result =O.getMul();// Num1 * Num2;
				break;
			case '/':
				O.Div(Num1, Num2);
				 Result = O.getDiv();//Num1 / Num2;
				break;

			}
			
		}
		return Result;
	}
}
