package tema3;

public class Inicializar {

	public static void main(String[] args) 
	{
		
		final int TAM = 20;
		int tabla[]= new int [TAM];
		
		for(int i=0;i<TAM;i++) 
		{
			
			tabla[i]=0;
		}
		
		for(int i=0;i<tabla.length;i++) 
		{
			
			System.out.print(tabla[i]+"");
		}
		
		

	}

}
