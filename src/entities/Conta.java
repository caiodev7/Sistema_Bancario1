package entities;

public class Conta {
	
	private int numero;
	private String usuario;
	private double balanco;
	public Conta(int numero, String usuario) {
		
		this.numero = numero;
		this.usuario = usuario;
		
	}
	public Conta(int numero, String usuario, double depositoInicial) {
		super();
		this.numero = numero;
		this.usuario = usuario;
		deposit(depositoInicial);
	}
	public int getNumero() {
		return numero;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario= usuario;
	}
	public double getBalanco() {
		return balanco;
	}
	
	public void deposit(double taxa) {
		balanco += taxa;
	}
	
	public void saque(double taxa) {
		balanco -= taxa + 5.0;
	}
	
	public String toString(){
		return "Conta"
			   + numero
		       + ", Usuário: "
		       + usuario
		       + ", Balanço: $ "
		       + String.format("%.2f", balanco);
		      
		       
	}
	
	
	
	

}
