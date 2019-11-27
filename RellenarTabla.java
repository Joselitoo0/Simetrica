package tema3;


import java.util.Scanner;

public class RellenarTabla 
{

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		int tabla[] = new int[4];
		int i;
		
		for(i=0;i<=3;i++) 
		{
			
			tabla[i]=0;
		}
		

		for(i=0;i<=3;i++) 
		{
			
			System.out.println("Indicar el valor de la tabla en la posición" + i);
			tabla[i]=teclado.nextInt();
		}
		
		for(i=0;i<=3;i++) 
		{
			
			System.out.println(tabla[i]);
		}
		
		teclado.close();
		

	}

}
