import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("Inserta el primer número");
		double n1 = a.nextDouble();
		
		System.out.println("Inserta el segundo número");
		double n2 = a.nextDouble();
		
		System.out.println("Que quieres hacer? (1-Sumar, 2-Restar)");
		int operacion = a.nextInt();
		
		while (operacion != 1 && operacion != 2) {
			System.out.println("Elige una de las dos opciones? (1-Sumar, 2-Restar)");
			operacion = a.nextInt();
		}	
		if (operacion == 1) {	
			double resultado = n1 + n2;
			System.out.println("El resultado de la suma es: " + resultado);
		}else {
			double resultado = n1 - n2;
			System.out.println("El resultado de la resta es: " + resultado);
		}
	}

}
