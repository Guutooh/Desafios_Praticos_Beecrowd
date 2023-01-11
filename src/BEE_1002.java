import java.util.Locale;
import java.util.Scanner;

public class BEE_1002 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
		
		double area,raio;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com Raio: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		
		System.out.printf("A = %.4f",area);
		
		sc.close();

    }
}
