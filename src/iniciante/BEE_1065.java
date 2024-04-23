package iniciante;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
*/
public class BEE_1065 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;

        int cont = 0;
        for (int i = 0; i < 5; i++) {
            x = input.nextInt();
            if (x % 2 == 0) cont++;
        }
        System.out.println(cont + " valores pares");

    }
}
