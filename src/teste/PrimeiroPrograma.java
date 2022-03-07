package teste;
import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o Primeiro Numero");
		a = scan.nextInt();
		System.out.println("Digite o Segundo Numero");
		b = scan.nextInt();
		
		int soma = soma (a,b);
		int subtracao = subtracao (a,b);
		int multiplicacao = multiplicacao (a,b);
		double divisao = divisao (a,b);
		System.out.println("A soma eh " + soma);
		System.out.println("A subtracao eh " + subtracao);
		System.out.println("A Multiplicacao eh " + multiplicacao);
		System.out.println("A divisao eh " + divisao);
		
	
	}

public static int soma(int a, int b) {
	return a + b;}
	public static int subtracao(int a, int b) {
		return a - b;}
		public static int multiplicacao(int a, int b) {
			return a * b;}
			public static double divisao(int a, int b) {
				return a % b;}

	}
