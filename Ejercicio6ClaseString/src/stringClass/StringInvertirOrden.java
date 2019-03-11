package stringClass;

import java.util.Scanner;

public class StringInvertirOrden {

	public static void main(String[] args) {
		
		// pedir palabra por consola e invertir orden de la cadena
		 Scanner entrada = new Scanner(System.in);
		 String palabraIntroducida;
		 String salida="";
		 
		 System.out.print("Introduzca la una palabra ");
		 palabraIntroducida = entrada.nextLine();
		 
		 //usar .REVERSE()
		 StringBuilder builder=new StringBuilder(palabraIntroducida);
		 String cadenaInvertida = builder.reverse().toString();
		 System.out.print("\nla palabra invertida: " + cadenaInvertida);
		 	 
		 //usando un bucle FOR
		 for (int i=palabraIntroducida.length()-1;i>=0;i--) {
			 salida = salida + palabraIntroducida.charAt(i);
		 }
		 System.out.print("\nla palabra invertida: " + salida);
		 
		 entrada.close();

	}

}
