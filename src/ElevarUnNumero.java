import java.util.Scanner;

public class ElevarUnNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float a, b, resultado;
		
		do {
			System.out.println("introduce el valor a");
			a = scan.nextInt();
			System.out.println("introduce el valor b");
			b = scan.nextInt();
			
			if (a <= 0 && b %2 == 0 ){
				System.out.println("no se puede calcular la raiz");
			}else {
				resultado = (float) Math.pow(a, 1/b);
				System.out.println(resultado);
			}
			
			
			
		}while (a != 0);
			

	}

}
