import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String name = "Andres";
		String pass = "1234";
		
		int intentos = 3;
		
		while (intentos	!= 0) {
			System.out.println("Nombre de usuario:");
			String usuario = a.nextLine();
		
			System.out.println("Contraseña:");
			String contr = a.nextLine();
			
		if (usuario == name && contr == pass) {
				System.out.println("Credenciales correctas");
				intentos = 0;
			}else {
				intentos --;
				System.out.println("Credenciales incorrectas, quedan " + intentos + " intentos");
			
			if (intentos == 0) {
					System.out.println("Has agotado los intentos");
				}
			}
	
		}
	}
}
