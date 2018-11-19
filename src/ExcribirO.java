
public class ExcribirO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] letras = new String[5][5];
		
		for(int x= 0; x < letras.length; x++) {
			for(int y = 0; y < letras.length; y++) {
				letras[x][y] = ".";
			}
		}
		
		
		for(int x= 0; x < letras.length; x++) {
			for(int y = 0; y < letras.length; y++) {
				if( y == Math.pow(x, 2)) {
					letras[x][y] = "O";
				}
			}
		}
		
		for(int x= 0; x < letras.length; x++) {
			for(int y = 0; y < letras.length; y++) {
				System.out.print(letras[x][y]);
			}
			System.out.println();
		}
		
	}

}
