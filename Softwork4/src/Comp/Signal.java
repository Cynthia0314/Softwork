package Comp;

import java.util.*;

//�ṩ���������

public class Signal extends Arithmetic {
	int x;
	int Sig;
	Random rand = new Random();
	/*rand.nextInt()���������int����Math.random�����������*/

	public Signal() {
		// TODO Auto-generated constructor stub
	}

	double RandomSig(int x, int Sig) {
		int f = rand.nextInt(2);

		if (Sig==0) {

			return rand.nextInt(x) + 1; //Math.random()*x+1;

		} else if (f == 0) {

			return rand.nextInt(x) + 1; //Math.random()*x+1;

		} else {
			return (rand.nextInt(x) + 1) * -1; //(Math.random()*x+1)*-1;
		}

	}
}
