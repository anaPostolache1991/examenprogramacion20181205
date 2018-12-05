package fp.daw.examen;

public class Ejercicio2 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'stringToArray' que
	 * reciba a través de un parámetro formal un objeto de tipo String y retorne
	 * un vector de caracteres de la misma longitud que la cadena recibida que 
	 * contenga los mismos caracteres que ésta y en el mismo orden. 
	 */
	
	public static char[] stringToArray(String cadena) {
		int l=cadena.length();
		
		char[]letras=new char[l];
		for(int i=0;i<cadena.length();i++) {
			letras[i]=cadena.charAt(i);
			System.out.print(letras[i]);
		}
		
		return letras;
		
	}
	
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'stringToArray' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		
		 stringToArray("cadena");
	}

}
