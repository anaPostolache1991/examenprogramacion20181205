package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void  billete() {
		Scanner sc=new Scanner(System.in);
		
		int cambio=0;
	   int devolver = (int) (cambio * 100);
	   
		int total=0;

	do{
	
		System.out.println("introduce billetees");
	     cambio=sc.nextInt();
	    
	  
	    
	    
	    
	    
	if(cambio>0) {
		System.out.println("error ..vuelve a introducir");
		if(cambio>=200) {
			devolver%=200;
		}if(cambio>=100) {
			devolver%=100;	
		}if(cambio>=50) {
			devolver%=50;	
		}if(cambio>=10) {
			devolver%=10;
		}if(cambio>=5) {
			devolver%=5;
		}
	}
	
	}while(cambio>0);
	   devolver%=100;
	}
	public static void main(String[] args) {
		billete();

	}

}
