package byteBank2Curso;

public class SistemaInterno {
	private String clave = "David258*";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedenIniciarSesion = gerente.iniciarSesion(clave);
		if(puedenIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		} else {
			System.out.println("Contraseña Invalida");
			return false;
		}
	}
	
	
	
}
