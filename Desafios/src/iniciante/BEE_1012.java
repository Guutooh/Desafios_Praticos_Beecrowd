package iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
 Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

public class BEE_1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double pi = 3.14159;

        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n", c * c * pi);
        System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);

        /*
         * maneira que eu resolvi o problema
         * 
         * double triangulo = a * c / 2.0;
         * double circulo = 3.14159 * (c * c);
         * double trapezio = ((a + b) * c) / 2;
         * double quadrado = b * b;
         * double retangulo = a * b;
         * 
         * System.out.println(String.format("TRIANGULO: %.3f", triangulo));
         * System.out.println(String.format("CIRCULO: %.3f", circulo));
         * System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
         * System.out.println(String.format("QUADRADO: %.3f", quadrado));
         * System.out.println(String.format("TRIANGULO: %.3f", retangulo));
         * 
         */

        input.close();

    }
}
