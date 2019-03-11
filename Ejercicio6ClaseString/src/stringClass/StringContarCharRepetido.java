package stringClass;

import java.util.Scanner;

public class StringContarCharRepetido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
			
		 String palabra;
		 String letraParaContar;
		 int contador = 0;
		 int counter = 0; //hago dos contadores para hacerlo de 2 formas diferentes
		 
		 System.out.print("Introduzca la una palabra ");
		 palabra = entrada.nextLine();
		 
		 System.out.print("Introduzca la letra que quiere contar: ");
		 letraParaContar = entrada.nextLine();
		 
		 String palabraMinusculas = palabra.toLowerCase(); //para que se cuenten aunque escriba en mayuscula
		    
		 System.out.print(palabra);
		 System.out.print("\n------------");
		 
		 
//		    for (int i=0; i<palabraMinusculas.length();i++) {
//		    		if (letraParaContar.equals(palabraMinusculas.charAt(i))) {
//		    		
//		    	}
//		    }
		    
		    
		    
		    
		    entrada.close();
		
		
	}

}
