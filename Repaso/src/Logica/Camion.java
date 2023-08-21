package Logica;

import java.math.BigDecimal;

public class Camion extends Vehiculo {
	float cap_carga;
	
	public Camion(String placa, String marca, String referencia, double precio, int num_ruedas, int modelo,
			float cap_carga) {
		super(placa, marca, referencia, precio, num_ruedas, modelo);
		this.cap_carga = cap_carga;
	}

	public float getCap_carga() {
		return cap_carga;
	}

	public void setCap_carga(float cap_carga) {
		this.cap_carga = cap_carga;
	}

	@Override
	public String toString() {
		return "Camion;  Capacidad carga " + cap_carga+ ",  Placa; " + getPlaca()
		+ ",  Marca; " + getMarca() + ",  Referencia; " + getReferencia() + ",  Precio; " + BigDecimal.valueOf(getPrecio())
		+ ",  Num ruedas; " + getNum_ruedas() + ",  Modelo; " + getModelo() + "]";
	}
}
