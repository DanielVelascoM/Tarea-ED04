package cuentas;

public class CCuenta {

	private String nombre;
		public void setNombre(String param) {
			nombre = param;
		}
	
		public String getNombre() {
			return nombre;
		}

	private String cuenta;
		public void setCuenta(String param) {
			cuenta = param;
		}

		public String getCuenta() {
			return cuenta;
		}
	
	private double saldo;
		public void setSaldo(double param) {
			saldo = param;
		}

		public double getSaldo() {
			return saldo;
		}

	private double tipoInteres;
		public void setTipoInteres(double param) {
			tipoInteres = param;
		}

		public double getTipoInteres() {
			return tipoInteres;
		}


		public CCuenta()
		{
		}

		public CCuenta(String nom, String cue, double sal, double tipo)
		{
			nombre =nom;
			cuenta=cue;
			saldo=sal;
		}

		public double estado()
		{
			return saldo;
		}

		public void ingresar(double cantidad) throws Exception
		{
			if (cantidad<0)
				throw new Exception("No se puede ingresar una cantidad negativa");
			saldo = saldo + cantidad;
		}

		public void retirar(double cantidad) throws Exception {
			if (cantidad <= 0)
				throw new Exception("No se puede retirar una cantidad negativa");
			if (estado() < cantidad)
				throw new Exception("No se hay suficiente saldo");
			saldo = saldo - cantidad;
		}
	
}
