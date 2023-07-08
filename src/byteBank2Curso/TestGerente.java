package byteBank2Curso;
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setClave("clave secreta");
		//gerente.setTipo(1);
		
		System.out.println(gerente.getBonificaion());
		System.out.println(gerente.iniciarSesion("clave secreta"));
	}
}
