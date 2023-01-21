
/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

import java.util.Scanner;

public class BEE_1018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0 && n < 1000000) {

            int values[] = { 100, 50, 20, 10, 5, 2, 1 };

            System.out.println(n);
            
            for (int i = 0; i < values.length; i++) {
                System.out.println(n / values[i] + " nota(s) de R$ " + values[i] + ",00");
                n = n % values[i];
            }
        }

        sc.close();

        /*
         * 
         * Scanner input = new Scanner(System.in);
         * int valor = input.nextInt();
         * 
         * 
         * System.out.println(valor / 100 + " nota(s) de R$ 100,00");
         * valor = valor % 100;
         * System.out.println(valor / 50 + " nota(s) de R$ 50,00");
         * valor = valor % 50;
         * System.out.println(valor / 20 + " nota(s) de R$ 20,00");
         * valor = valor % 20;
         * System.out.println(valor / 10 + " nota(s) de R$ 10,00");
         * valor = valor % 10;
         * System.out.println(valor / 5 + " nota(s) de R$ 5,00");
         * valor = valor % 5;
         * System.out.println(valor / 2 + " nota(s) de R$ 2,00");
         * valor = valor % 2;
         * System.out.println(valor / 1 + " nota(s) de R$ 1,00");
         * 
         * 
         * 
         * input.close();
         */

        /*
         * terceira alternativa
         * 
         * int notas100 = valor / 100;
         * valor -= notas100 * 100;
         * 
         * int notas50 = valor / 50;
         * valor -= notas50 * 50;
         * 
         * int notas20 = valor / 20;
         * valor -= notas20 * 20;
         * 
         * int notas10 = valor / 10;
         * valor -= notas10 * 10;
         * 
         * int notas5 = valor / 5;
         * valor -= notas5 * 5;
         * 
         * int notas2 = valor / 2;
         * valor -= notas2 * 2;
         * 
         * int notas1 = valor;
         * 
         * System.out.println(notas100 + " nota(s) de R$ 100,00");
         * System.out.println(notas50 + " nota(s) de R$ 50,00");
         * System.out.println(notas20 + " nota(s) de R$ 20,00");
         * System.out.println(notas10 + " nota(s) de R$ 10,00");
         * System.out.println(notas5 + " nota(s) de R$ 5,00");
         * System.out.println(notas2 + " nota(s) de R$ 2,00");
         * System.out.println(notas1 + " nota(s) de R$ 1,00");
         * 
         * 
         */

    }
}
