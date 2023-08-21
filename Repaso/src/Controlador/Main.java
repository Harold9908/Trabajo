package Controlador;
import Logica.Concesionario;
public class Main {

	public static void main(String[] args) {
		System.out.print("Arranco");
		Concesionario concesionario = new Concesionario();
		concesionario.registrarVehiculo();
		concesionario.listarVehiculo();
		concesionario.venderVehiculo();
		concesionario.ventas();
		System.out.print("Arranco");
		concesionario.buscarVehiculo();
		concesionario.cantidadMotos();
		concesionario.eliminar();
		concesionario.modificar();
		System.out.print("Arranco");
	}

}
