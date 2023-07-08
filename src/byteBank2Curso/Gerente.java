package byteBank2Curso;
public class Gerente extends Funcionario {
	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public double getBonificaion() {
		System.out.println("Ejecutando metodo del Gerente");
		return super.getSalario()+super.getBonificacion();
	}
	
	public boolean iniciarSesion (String clave) {
		if(this.clave == clave) {
			return true;
		}else {
			return false;
		}
	}
}
