package byteBank2Curso;

public abstract class Cuenta {
	private double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total = 0;
		
	public Cuenta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;

		
		Cuenta.total++;
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfiere (double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	 public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	 
	public static int getTotal() {
		return total;
	}
}
