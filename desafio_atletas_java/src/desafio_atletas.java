import java.util.Locale;
import java.util.Scanner;

public class desafio_atletas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N, i, quantidadeHomen, quantidadeMulher;
			String nome, sexo, atletaAlto;
			double altura, alturaMaior, alturaMulher, alturaMulherMedia;
			double peso, pesoSoma, pesoMedio, porcentagemHomens;
		
			alturaMaior = 0;
			alturaMulher = 0;
			atletaAlto = "";
			quantidadeHomen = 0;
			quantidadeMulher = 0;
			pesoSoma = 0;
			
		   System.out.print("Qual a quantidade de atletas? ");
		   N = sc.nextInt();
		   
		   for (i = 1; i <= N; i++) {
			   System.out.println("Digite os dados do atleta numero "+ i +" : ");
			   System.out.print("Nome: ");
			   sc.nextLine();
			   nome = sc.nextLine();
			   System.out.print("Sexo: ");
			   sexo = sc.next();
			   
			   while (!sexo.equals("F") && !sexo.equals("M")) {
				   System.out.print("Valor invalido! Favor digitar F ou M: ");
				   sexo = sc.next();
			   }
			   
			   System.out.print("Altura: ");
			   altura = sc.nextDouble();
			   
			   while (altura <= 0) {
				   System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				   altura = sc.nextDouble();
			   }
			   
			   System.out.print("Peso: ");
			   peso = sc.nextDouble();
			   
			   while (peso <= 0) {
				   System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				   peso = sc.nextDouble();
			   }
			   
			   if (altura > alturaMaior) {
				   alturaMaior = altura;
				   atletaAlto = nome;
			   }
			   
			   if (sexo.equals("M")) {
				   quantidadeHomen = quantidadeHomen + 1;
			   }
			   else {
				   quantidadeMulher = quantidadeMulher + 1;
				   alturaMulher = alturaMulher + altura;
			   }
			   
			   pesoSoma = pesoSoma + peso;
		   }
		   
		   if (N != 0) {
			   pesoMedio = pesoSoma / N;
			   porcentagemHomens = (double) quantidadeHomen * 100 / N;
			   
			   System.out.println();
			   System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
			   System.out.printf("Atleta mais alto: %s%n", atletaAlto);
			   System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
			   
			   if (quantidadeMulher != 0) {
				   alturaMulherMedia = alturaMulher / quantidadeMulher;
				   System.out.printf("Altura média das mulheres: %.2f%n", alturaMulherMedia);
			   }
			   else {
				   System.out.println("Não há mulheres cadastradas ");
			   }
		   }
		   else {
			   System.out.println("Não há atletas cadastradas");
		   }
		sc.close();

	}

}
