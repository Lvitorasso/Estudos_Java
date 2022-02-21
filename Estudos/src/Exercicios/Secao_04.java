package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Secao_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/* EX - 1 */		

		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Soma = " + (a + b));

		/* EX - 2 */	
		
		double pi = 3.14159, raio, area;
		raio = sc.nextDouble();
		area = (pi*(Math.pow(raio, 2)));
		
		System.out.printf("A = %.4f", area);

		/* EX - 3 */				
	
		int  c, d, result;
	
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		result = a * b - c * d;

		System.out.printf("A = %d", result);
		
		/* EX - 4 */
		
		
		int numFuncionario, horas;
		double precoHora, resultDouble;
		
		numFuncionario = sc.nextInt();
		horas = sc.nextInt();
		precoHora = sc.nextDouble();
		resultDouble = horas * precoHora;
		

		System.out.printf("NUMBER = %d%n", numFuncionario);
		System.out.printf("SALARY = %.2f", resultDouble);
		
		/* EX - 5 */
			
		int qte1, qte2;
	    double preco1, preco2, total;

	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		
	    /* EX - 6 */
		
		double aDouble, bDouble, cDouble;

	    aDouble = sc.nextDouble();
	    bDouble = sc.nextDouble();
	    cDouble = sc.nextDouble();		

	    System.out.printf("TRIANGULO %.2f%n", (aDouble * cDouble / 2.0));
	    System.out.printf("CIRCULO %.2f%n",  (3.14159 * cDouble * cDouble));
	    System.out.printf("TRAPEZIO %.2f%n", ((aDouble + bDouble) / 2.0 * cDouble));
	    System.out.printf("QUADRADO %.2f%n", (bDouble * bDouble));
	    System.out.printf("RETANGULO %.2f%n", (aDouble * bDouble));

	    sc.close();

	}

}
