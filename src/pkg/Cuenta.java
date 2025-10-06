/**
 * 
 */
package pkg;

/**
 * 
 */
public class Cuenta {

	private final String numero, titular;
	private Double saldo;
	
	
	public Cuenta(String numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}


	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}


	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}


	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}


	public void ingresar(double ingreso) {
		// TODO Auto-generated method stub
		saldo += ingreso;
	}


	public void retirar(double retiro) {
		// TODO Auto-generated method stub
		saldo -= retiro;
	}
	
	
	
}
