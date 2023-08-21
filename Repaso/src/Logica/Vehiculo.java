package Logica;

public abstract class Vehiculo {
	private String placa,marca, referencia;
	private double precio;
	private int num_ruedas, modelo;
	public Vehiculo(String placa, String marca, String referencia, double precio, int num_ruedas, int modelo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.referencia = referencia;
		this.precio = precio;
		this.num_ruedas = num_ruedas;
		this.modelo=modelo;
	}
	public Vehiculo() {
		
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getNum_ruedas() {
		return num_ruedas;
	}
	public void setNum_ruedas(int num_ruedas) {
		this.num_ruedas = num_ruedas;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public abstract  String toString();
	
	
}
