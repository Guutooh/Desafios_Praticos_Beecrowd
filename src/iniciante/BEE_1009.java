package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE_1009 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        String nomeVendedor = input.next();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();

        double TOTAL = ((totalVendas*15)/100) + salarioFixo;

        System.out.println(String.format("TOTAL = R$ %.2f" , TOTAL));

        input.close();


    }


}
