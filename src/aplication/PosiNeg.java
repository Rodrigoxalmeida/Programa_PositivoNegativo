/*Verifica se o numero e positivo ou negativo usando metodo boolean*/

package aplication;

import java.util.Scanner;
import entities.CalcPosiNeg;

public class PosiNeg {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		float n = sc.nextFloat();
		
		if(CalcPosiNeg.isPositive(n)) {
			System.out.println("positivo");
		}else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}
