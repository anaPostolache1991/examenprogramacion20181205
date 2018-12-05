package fp.daw.examen;

public class Ejercicio6 {

	/* 
	 *  2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que cree un vector de números enteros de un
	 * tamaño aleatorio comprendido entre 100 y 500. Una vez creado lo llenará llenará con
	 * números aleatorios comprendidos entre 0 y 1000000. Después de llenar el vector 
	 * mostrará la mínima diferencia entre dos valores adyacentes. La diferencia entre dos
	 * valores adyacentes se calcula como el valor almacenado en cada posición [i] (excepto
	 * la primera) menos el valor almacenado en la posición [i-1].
	 */
		
	public static void ej6() {
		int tamaño=(int)Math.floor(Math.random()*(100-500)+500);
		int []vector=new int[tamaño];
		int diferencia=0;
		//int nuevoTamaño=(int)Math.floor(Math.random()*(0-1000000)+1000000);
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)Math.floor(Math.random()*(0-1000000)+1000000);
			if(vector[i]>vector[i+i]) {
				//diferencia=vector[i];
			}
		}
		
	}
	public static void main(String[] args) {
		
  
	}

}
