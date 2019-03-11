package stringClass;

import java.util.Scanner;

public class StringClassExercises {

	public static void main(String[] args) {
		// contar numero de vocales
		
		 Scanner entrada = new Scanner(System.in);
		
		 String palabra;
		 int contador = 0;
		 int counter = 0; //hago dos contadores para hacerlo de 2 formas diferentes
		 
		 System.out.print("Introduzca la una palabra ");
		 palabra = entrada.nextLine();
		 String palabraMinusculas = palabra.toLowerCase(); //para que se cuenten aunque escriba en mayuscula
		    
		 System.out.print(palabra);
		    System.out.print("\n------------");
		    
		    //uso charAt
		    for(int i=0; i<palabraMinusculas.length();i++) {
		    	if ((palabraMinusculas.charAt(i)=='a') || (palabraMinusculas.charAt(i)=='e') || (palabraMinusculas.charAt(i)=='i') || (palabraMinusculas.charAt(i)=='o') || (palabraMinusculas.charAt(i)=='u'))
		    	{
		    	    contador++;
		    	}	    	
		    }
		    
		    //uso un bucle FOR, habiendo declarado letra=charAt
		    for(int i=0; i<palabraMinusculas.length();i++) {
		    	char letra = palabraMinusculas.charAt(i);
		    	if(letra=='a'||letra == 'e'||letra=='i'||letra=='o'||letra=='u')
		    	{
		    	    counter++;
		    	}	
		    }
		    System.out.print("la palabra introducida tiene: " + palabraMinusculas.length() + " caracteres.\n" );
		    System.out.print("la palabra introducida tiene: " + contador + " vocales.\n" );
		    System.out.print("la palabra introducida tiene: " + counter + " vocales.\n" );
	    entrada.close();
	  }
	}