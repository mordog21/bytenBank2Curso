package byteBank2Curso;

public class Cliente implements Autenticable{
	 private String nombre;
	 private String numeroIdentidad;
	 private String telefono;
	 
	 private AutenticacionUtil util;
	 
	 public Cliente() {
		 this.util = new AutenticacionUtil();
	 }
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}
	
	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String profesion) {
		this.telefono = profesion;
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		
		return this.util.iniciarSesion(clave);
	}

	
}
