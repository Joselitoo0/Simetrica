package tema3;

import java.util.Scanner;

public class BuscarPosicion 
{

	public static void main(String[] args) 
	{


		Scanner teclado = new Scanner(System.in);
		
		String frase;
		char caracter;
		int posicion=0;
		System.out.println("Indique una frase: ");
		frase=teclado.next();
		System.out.println("Indique el carácter a buscar: ");
		caracter=teclado.next().charAt(0);
		
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==caracter) {
				posicion= i;
			}
		}
		if (posicion==-1) {
			System.out.println("No encontrado");
		}
		else {
			System.out.println("Se ha encontrado en la posicion" + posicion);
		}
		
		teclado.close();

	}

}
