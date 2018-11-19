import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numeroAdivinar =(int) (Math.random()*100 +1);
		int intentos = 1;
		int numeroIntroducido;
		
		System.out.println(numeroAdivinar);
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Prueba suerte e introduce un numero");
			numeroIntroducido = scan.nextInt();
			
			if(numeroIntroducido < numeroAdivinar) {
				System.out.println("el numero a adivinar es mas grande");
			}else if(numeroIntroducido > numeroAdivinar) {
				System.out.println("el numero a adivinar es mas pequeño");
			}else {
				System.out.println("Enhorabuena has acertado el numero");
				break;
			}
		
			if(i == 5 ) {
				System.out.println("Te has pasado de intentos lo sentimos"); 
			}
			
		}
		
		
	}

}
