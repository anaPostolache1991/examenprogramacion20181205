package fp.daw.examen;

import java.util.Arrays;

public class Ejercicio4 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'arrayAleatorioOrdenado' que
	 * reciba en un parámetro formal un número entero que determinará la dimensión de un
	 * vector de números enteros que tendrá que crear y rellenar con números aleatorios
	 * comprendidos entre 975 y 13579 y ordenados de menor a mayor a partir de la posición 0.
	 * Finalmente retornará el array.
	 */
	
	public static int[] arrayAleatorioOrdenado(int numero) {
		int []vector=new int[numero];
		int aux;
		for(int i=0;i<vector.length;i++) {
			
			vector[i]=(int)Math.floor(Math.random()*(975-13579)+13579);
			
		   }
	
		
	/*
		for(int i=0;i<=4;i++) {
			for(int j=0;i<4;i++) {
				if(vector[i]<vector[i+1]) {
					aux=vector[i];
					vector[i]=vector[i+1];
					vector[i+1]=aux;
				}
			}
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(vector[i]);
		}
		*/
		Arrays.sort(vector);
		System.out.println("los numeros ordenados son :"+Arrays.toString(vector));
		return vector;
		
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'arrayAleatorioOrdenado' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		arrayAleatorioOrdenado(5);

	}

}
