package Logica;

import java.math.BigDecimal;

public class Auto extends Vehiculo {
	private int num_puertas;
	private Gasolina isGasolina;
	public Auto(String placa, String marca, String referencia, double precio, int num_ruedas, int num_puertas,
			Gasolina  isGaolina, int modelo) {
		super(placa, marca, referencia, precio, num_ruedas,modelo);
		this.num_puertas = num_puertas;
		this.isGasolina = isGaolina;
	}
	public int getNum_puertas() {
		return num_puertas;
	}
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}
	public Gasolina  getIsGasolina() {
		return isGasolina;
	}
	public void setIsGaolina(Gasolina  isGaolina) {
		this.isGasolina = isGaolina;
	}
	@Override
	public String toString() {
		return "Auto;  Gasolina " + isGasolina + ",  numero de puertas; " + num_puertas + ",  Placa; " + getPlaca()
		+ ",  Marca; " + getMarca() + ",  Referencia; " + getReferencia() + ",  Precio; " + BigDecimal.valueOf(getPrecio())
		+ ",  Num ruedas; " + getNum_ruedas() + ",  Modelo; " + getModelo() + "]";
	}
	
}
