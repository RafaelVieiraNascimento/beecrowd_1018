package program;

/*
beecrowd | 1018 - Cédulas

Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha,
caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		System.out.println(valor);
		
		int nota100 = valor / 100;
		valor = valor % 100;
		int nota50 = valor / 50;
		valor = valor % 50;
		int nota20 = valor / 20;
		valor = valor % 20;
		int nota10 = valor / 10;
		valor = valor % 10;
		int nota5 = valor / 5;
		valor = valor % 5;
		int nota2 = valor / 2;
		valor = valor % 2;
		int nota1 = valor / 1;
		
		System.out.printf("%d nota(s) de R$ 100,00\n"
				+ "%d nota(s) de R$ 50,00\n"
				+ "%d nota(s) de R$ 20,00\n"
				+ "%d nota(s) de R$ 10,00\n"
				+ "%d nota(s) de R$ 5,00\n"
				+ "%d nota(s) de R$ 2,00\n"
				+ "%d nota(s) de R$ 1,00\n",
				nota100, nota50, nota20, nota10, nota5, nota2, nota1);
		sc.close();
	}
}
