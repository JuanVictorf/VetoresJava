package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de entradas: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite uma altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma+= vect[i];
		}
		
		double media = soma / n;
		
		System.out.println("==============================================");
		System.out.println("A primeira altura digitada foi: " + vect[0]);
		System.out.println("A segunda altura digitada foi: " + vect[1]);
		System.out.println("A terceira altura digitada foi: " + vect[2]);
		System.out.println("==============================================");
		
		System.out.printf("A media de altura é: %.2f%n", media);
		
		sc.close();
		
	}
}
