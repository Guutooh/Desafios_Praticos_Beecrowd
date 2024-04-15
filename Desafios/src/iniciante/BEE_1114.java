package iniciante;

import java.util.Scanner;

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.
*/
public class BEE_1114 {

    public static void main(String[] args) {

        int senha = 2002;

        Scanner input = new Scanner(System.in);

        int tentativa = input.nextInt();

        while (tentativa != senha) {
            System.out.println("Senha Invalida");
            tentativa = input.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
