package Comp;

public class Operation extends Arithmetic {
	
void Add(double n1,double n2){
	Num1=n1;
	Num2=n2;
}
double getAdd(){
	return Num1+Num2;
}
void Sub(double n1,double n2){
	Num1=n1;
	Num2=n2;
}
double getSub(){
	return Num1-Num2;
}
void Mul(double n1,double n2){
	Num1=n1;
	Num2=n2;
}
double getMul(){
	return Num1*Num2;
}
void Div(double n1,double n2){
	Num1=n1;
	Num2=n2;
}
double getDiv(){
	if(Num2==0){
		System.out.println("ERROR!");
	}

	return Num1/Num2;
}
}