package byteBank2Curso;
public class Gerente extends Funcionario implements Autenticable{
	
	public double getBonificacion() {
		System.out.println("Ejecutando metodo del Gerente");
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
