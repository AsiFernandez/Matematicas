
public class LanzarDosDados {

	public static void main(String[] args) {
		
		int dado1 = 0;
		int dado2 = 0;
		
		dado1 = (int) (Math.random()*6 + 1);
		dado2 = (int) (Math.random()*6 + 1 );
		
		System.out.println("El primer dado ha tocado " + dado1);
		System.out.println("El segundo dado ha tocado " + dado2);
		
		

	}

}
