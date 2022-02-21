package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Secao_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/* EX 1 */
		
		while(sc.nextInt() != 2002) {
			System.out.println("Senha invalida");
		}

		System.out.println("Acesso permitido");		

		/* EX 2 */
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		 while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		/* EX 3 */
		
		int al = 0, gas = 0, die = 0, tipo = 0;
		
		while(tipo != 4) {
			if(tipo == 1)
			  al+=1;
			else if(tipo == 2)
			  gas+=1;
			else if(tipo == 3)
			  die+=1;
			else
				System.out.println("Codigo invalido, digite novamente");	
			
			tipo = sc.nextInt();
		}
		

		System.out.printf("MUITO OBRIGADO %n "
				+ "Alcool: %d%n "
				+ "Gasolina: %d%n"
				+ "Diesel: %d%n", al,gas,die);
		
		/* EX 1 */
		
		x = 0;
		x = sc.nextInt();
		for(int i = 1; i < x; i+=2)
			System.out.println(i);
		
		/* EX 2 */
		
		x = 0;
		int dentro = 0, fora = 0;
		x = sc.nextInt();
		
		int[] yy = new int[x];
		
		for(int i = 0; i < x; i++)
			yy[i] = sc.nextInt();
		
		for(int i = 0; i < x; i++)
			if(yy[i] >= 10 && yy[i] <= 20)
				dentro++;
			else
				fora++;
		
		System.out.printf("Dentro %d%n"
		+ "Fora: %d ", dentro, fora);
		
		/* EX 3 */
		
		int linha = 0;
		linha = sc.nextInt();
		int[][] yyy = new int[linha][3];
		int[] media = new int[linha];
		
		for(int i = 0; i < linha; i++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				yyy[i][coluna] = sc.nextInt();
				
				if(coluna == 2) {
					media[i] = (yyy[i][0]+yyy[i][1]+yyy[i][2])/3;
				}
			}
		}
		
		for(int i = 0; i < linha; i++) {
			System.out.println(media[i]);
		}
		
		
		/* EX 4 */
		int n = 0;
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			 x = sc.nextInt();
			 y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		/* EX 5 */
		
		n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		/* EX 6 */
		
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		/* EX 7 */
		
		 n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {
				int primeiro = i;
				int segundo = i * i;
				int terceiro = i * i * i;
				System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			}
		
		sc.close();
	}
}
