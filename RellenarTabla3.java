package tema3;

import java.util.Scanner;

public class RellenarTabla3 
{

	public static void main(String[] args) 
	{


		Scanner teclado = new Scanner(System.in);

		int tabla3[] = new int[4];
		int i;

		for(i=0;i<=3;i++) 
		{

			tabla3[i]=0;
		}


		for(i=0;i<=3;i++) 
		{

			System.out.println("Indicar el valor de la tabla en la posición " + i);
			tabla3[i]=teclado.nextInt();
		}
		
		for(i=3;i>=0;i--) 
		{
			
			System.out.println(tabla3[i]);
		}
		
		teclado.close();

	}

}
