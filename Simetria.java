package tema3;

import java.util.Scanner;

public class Simetria 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int i,j;
		boolean simetrica=true;
		
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.println("Indique los valores de la matriz:("+i+"-"+j+")");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
			if(matriz[i][j]!=matriz[j][i]) {
				simetrica=false;
			}	
			}
			
		
		}
		
		if(simetrica)
		{
			System.out.println("Es simétrica");
		}
		else {
			System.out.println("No es simétrica");
		}
		
		
		
		teclado.close();
		
		

	}

}
