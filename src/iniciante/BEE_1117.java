package iniciante;

import java.util.Scanner;

/*Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.

*/
public class BEE_1117 {

    public static void main(String[] args) {

        float firstScore, media = 0, total = 0, total2 = 0;

        Scanner input = new Scanner(System.in);

        while (total2 != 2) {

            firstScore = input.nextFloat();

            if (firstScore >= 0.0 && firstScore <= 10.0) {

                total += firstScore;

                total2 += 1;

            } else {

                System.out.print("nota invalida\n");
            }
        }

        media = (float) total / 2;

        System.out.printf("media = %.2f\n", media);

    }

}
