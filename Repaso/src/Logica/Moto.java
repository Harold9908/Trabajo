package Logica;

import java.math.BigDecimal;

public class Moto extends Vehiculo {
	private int cilindraje;
	private float tam_tanque;
	public Moto(String placa, String marca, String referencia, double precio, int num_ruedas, int cilindraje,
			float tam_tanque,int modelo) {
		super(placa, marca, referencia, precio, num_ruedas,modelo);
		this.cilindraje = cilindraje;
		this.tam_tanque = tam_tanque;
	}
	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	public float getTam_tanque() {
		return tam_tanque;
	}
	public void setTam_tanque(float tam_tanque) {
		this.tam_tanque = tam_tanque;
	}
	@Override
	public String toString() {
		return "Moto;  cilindraje; " + cilindraje + ",  Tamtanque; " + tam_tanque + ",  Placa; " + getPlaca()
				+ ",  Marca; " + getMarca() + ",  Referencia; " + getReferencia() + ",  Precio; " + BigDecimal.valueOf(getPrecio())
				+ ",  Num ruedas; " + getNum_ruedas() + ",  Modelo; " + getModelo() + "]";
	}
	
	
	
}
