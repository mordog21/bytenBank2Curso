package byteBank2Curso;

public class AutenticacionUtil {
	private String clave = "David258*";
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}	
	
	public void setClave(String clave) {
		this.clave = clave;
	}
}
