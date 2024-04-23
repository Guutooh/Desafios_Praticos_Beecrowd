package iniciante;

import java.util.Scanner;

/*m Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo
para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será
encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.*/
public class BEE_1134 {
    public static void main(String[] args) {

        int Produto = 0;
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

        Scanner in = new Scanner(System.in);

        while (Produto != 4) {
            Produto = in.nextInt();
            if (Produto == 1) {
                Alcool += 1;
            } else if (Produto == 2) {
                Gasolina += 1;
            } else if (Produto == 3) {
                Diesel += 1;
            }
        }

        System.out.printf("MUITO OBRIGADO \nAlcool: %d \nGasolina: %d \nDiesel: %d",Alcool,Gasolina,Diesel);


        System.out.print("MUITO OBRIGADO\n");
        System.out.print("Alcool: " + Alcool + "\n");
        System.out.print("Gasolina: " + Gasolina + "\n");
        System.out.print("Diesel: " + Diesel + "\n");
    }
}

