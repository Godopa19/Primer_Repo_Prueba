import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("Escribe una frase:");
		String frase = a.nextLine();
		
		System.out.println("Escribe la letra que quieres contar:");
		char letra = a.next().charAt(0);
				
		char lista[] = frase.toCharArray();
		int numero = lista.length;
		int resultado = 0;
		
		for (int contador = 0; contador < numero; contador ++) {
			if (lista[contador] == letra) {
				resultado++;
			}	
		}
		System.out.println("Hay " + resultado + " letras " + letra);	
	}

}
