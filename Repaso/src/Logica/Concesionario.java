package Logica;
import Vista.Modificar;
import Vista.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;
public class Concesionario implements ConcesionarioFunciones {
	private ArrayList<Vehiculo>vehi= new ArrayList<Vehiculo>();
	private ArrayList<Vehiculo>vendidos= new ArrayList<Vehiculo>();
	private ArrayList<Vehiculo>encontrados=new ArrayList<Vehiculo>();
	private ArrayList<Vehiculo>principal=new ArrayList<Vehiculo>();
	Principal ventana = new Principal();
	DefaultListModel listModel = new DefaultListModel();
	DefaultListModel listModel2 = new DefaultListModel();
	
	public Concesionario() {
		this.vehi= vehi;
		this.vendidos=vendidos;
		// ingreso una lista de vehiculos 
		vehi.add(new Moto("DFS 34G", "YAMAHA", "MT 15", 20000999, 2, 150,5,2023 ));
		vehi.add(new Auto("ASD 456", "MAZDA", "MAZDA3", 23000987, 4, 4, Gasolina.SI, 2022));
		vehi.add(new Moto("AFD 56F", "PULSAR","NS200",12345999,2,200,4,2022));
		vehi.add(new Moto("YAO 56G", "PULSAR","NS200",10000999,2,200,4,2023));
		vehi.add(new Moto("LKJ 78G", "PULSAR","NS200",10000999,2,200,4,2023));
		vehi.add(new Moto("AGF 54F", "PULSAR","NS200",10000999,2,200,4,2021));
		vehi.add(new Moto("HGF 45G", "YAMAHA", "MT 09", 50608899, 2, 150,5,2023 ));
		vehi.add(new Moto("VBC 34G", "YAMAHA", "MT 10", 85900999, 2, 150,5,2023 ));
		vehi.add(new Moto("KHJ 67G", "YAMAHA", "MT 07", 28000999, 2, 150,5,2023 ));
		vehi.add(new Auto("YGH 454", "MAZDA", "MAZDA3", 23087887, 4, 4, Gasolina.SI, 2022));
		vehi.add(new Auto("IUJ 098", "MAZDA", "MAZDA4", 23000987, 4, 4, Gasolina.NO, 2024));
		vehi.add(new Auto("MNB 543", "BMW	", "SERIE 1", 29899999, 4, 4, Gasolina.SI, 2023));
		vehi.add(new Auto("345 HYT", "BMW", "SERIE 2", 23987987, 4, 4, Gasolina.SI, 2023));
		vehi.add(new Auto("675 JKH", "BMW", "SERIE 2", 23987987, 4, 4, Gasolina.SI, 2023));
		vehi.add(new Auto("908M YRR", "BMW", "SERIE 3", 23987987, 4, 4, Gasolina.SI, 2023));
		vehi.add(new Camion("UTY 342", "VOLVO", "VOLVO 1", 54897999, 10, 2014, 5));
		vehi.add(new Camion("GHF 457", "VOLVO", "VOLVO 1", 54897999, 10, 2017, 8));
		vehi.add(new Camion("LKI 098", "VOLVO", "VOLVO 1", 54897999, 10, 2017, 8));
		//principal.addAll(vehi);
		ventana.setVisible(true); // ventana la vuelvo visible.
	}
	public ArrayList<Vehiculo> getVehi() {
		return vehi;
	}

	public void setVehi(ArrayList<Vehiculo> vehi) {
		this.vehi = vehi;
	}
	// metodo para registrar un vehiculo
	@Override
	public void registrarVehiculo() {
		ventana.getBoton1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean esta = false; // decalramos un boolean para controlar si la placa ingresada ya existe
				for(int i=0;i<vehi.size();i++) {
					if (ventana.getPlacaM().getText().equalsIgnoreCase(vehi.get(i).getPlaca())) { // condicion para verificar que no se registre la misma placa 
						esta = true;
						ventana.getMensaje().setVisible(true);
						break;
					}else {
						esta=false;
					}
				}
				if (esta==false) { // si la placa no existe entra a registrar vehiculos
					if (ventana.getTipoVehiculo().getSelectedItem().equals("Moto")) { // si en el jcombobx se selecciona "Moto regsitra los atributos de una moto"
						vehi.add(new Moto(ventana.getPlacaM().getText(), ventana.getMarcaM().getText(),
							ventana.getReferenciaM().getText(), Double.parseDouble(ventana.getPrecioM().getText()), 
							Integer.parseInt(ventana.getNumRuedasM().getText()), Integer.parseInt(ventana.getCilindrajeM().getText()), 
							Float.parseFloat(ventana.getTamTanqueM().getText()),
							Integer.parseInt(ventana.getModeloM().getText()))); // se crea un objeto de tipo moto con sus atributos y se guarda en el arraylist de vehiculos
						ventana.getPlacaM().setText("");;											
						ventana.getMarcaM().setText("");
						ventana.getReferenciaM().setText("");				// seteamos los campos de texto despues de cada registro
						ventana.getPrecioM().setText("");
						ventana.getNumRuedasM().setText("");
						ventana.getCilindrajeM().setText("");
						ventana.getModeloM().setText("");
						ventana.getTamTanqueM().setText("");
						ventana.getMensaje().setVisible(false);
					}else if(ventana.getTipoVehiculo().getSelectedItem().equals("Camion")) { // si en el jcombobox se selecciona camion registra un objeto de tipo camion. llamando a los de texto de la ventana principal
						vehi.add(new Camion(ventana.getPlacaM().getText(), ventana.getMarcaM().getText(),
								ventana.getReferenciaM().getText(), Double.parseDouble(ventana.getPrecioM().getText()), 
								Integer.parseInt(ventana.getNumRuedasM().getText()),
								Integer.parseInt(ventana.getModeloM().getText()),Float.parseFloat(ventana.getCapCarga().getText()))); // se crea un objeto de tipo camion con sus 
							ventana.getPlacaM().setText("");;											// atributos y se guarda en el arraylist de vehiculos
							ventana.getMarcaM().setText("");
							ventana.getReferenciaM().setText("");				// seteamos los campos de texto despues de cada registro
							ventana.getPrecioM().setText("");
							ventana.getNumRuedasM().setText("");
							ventana.getCapCarga().setText("");
							ventana.getModeloM().setText("");
							ventana.getMensaje().setVisible(false);
					}else if (ventana.getTipoVehiculo().getSelectedItem().equals("Auto")) {
						vehi.add(new Auto(ventana.getPlacaM().getText(), ventana.getMarcaM().getText(),
								ventana.getReferenciaM().getText(), Double.parseDouble(ventana.getPrecioM().getText()), 
								Integer.parseInt(ventana.getNumRuedasM().getText()), Integer.parseInt(ventana.getNumPuertasV().getText()),  
								(Gasolina)ventana.getGasolinaV().getSelectedItem(), 
								Integer.parseInt(ventana.getModeloM().getText()))); // se crea un objeto de tipo Auto con sus 
							ventana.getPlacaM().setText("");;											// atributos y se guarda en el arraylist de vehiculos
							ventana.getMarcaM().setText("");
							ventana.getReferenciaM().setText("");				// seteamos los campos de texto despues de cada registro
							ventana.getPrecioM().setText("");
							ventana.getNumRuedasM().setText("");
							ventana.getModeloM().setText("");
							ventana.getMensaje().setVisible(false);
							ventana.getNumPuertasV().setText("");
					}
				}	
				ventana.getBuscarV().setText("");
				principal.addAll(vehi);
				vehi.clear();
				vehi.addAll(principal);
				principal.clear();
				listModel = new DefaultListModel(); // creamos un modelo de lita para agregar la lista de vehiculos
				listModel.addAll(vehi);	
				ventana.getList1().setModel(listModel); // a la lista de la pantalla se le agrega el modelo de lista con el arreglo de los vehivulos
				ventana.getBoton3().setEnabled(true); // activamos el boton de "vender"
				ventana.getEtiquetaAviso().setVisible(false);
				ventana.getModificarM().setEnabled(true);	// activamos el boton de modificar
			}
		});
		
		ventana.getSelected().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.getPlacaM().setEnabled(true);   // habilita todos los campos de texto
				ventana.getMarcaM().setEnabled(true);
				ventana.getReferenciaM().setEnabled(true);
				ventana.getNumRuedasM().setEnabled(true);
				ventana.getModeloM().setEnabled(true);
				ventana.getPrecioM().setEnabled(true);
				ventana.getBoton1().setEnabled(true);
				if (ventana.getTipoVehiculo().getSelectedItem().equals("Camion")) { // dependiendo de la seleccion en el jcombobox se habilitan los campos de texto
					ventana.getCapCarga().setEnabled(true);     // de cada tipo de objeto.
					ventana.getCilindrajeM().setEnabled(false);
					ventana.getTamTanqueM().setEnabled(false);
					ventana.getNumPuertasV().setEnabled(false);
					ventana.getGasolinaV().setEnabled(false);
				}else if (ventana.getTipoVehiculo().getSelectedItem().equals("Moto")) {
					ventana.getCilindrajeM().setEnabled(true);
					ventana.getTamTanqueM().setEnabled(true);
					ventana.getCapCarga().setEnabled(false);
					ventana.getNumPuertasV().setEnabled(false);
					ventana.getGasolinaV().setEditable(false);
				}else if (ventana.getTipoVehiculo().getSelectedItem().equals("Auto")) {
					ventana.getNumPuertasV().setEnabled(true);
					ventana.getGasolinaV().setEnabled(true);
					ventana.getCapCarga().setEnabled(false);
					ventana.getCilindrajeM().setEnabled(false);
					ventana.getTamTanqueM().setEnabled(false);
					
				} 
			}
		});

		
	}
	@Override
	public void buscarVehiculo() {
		ventana.getBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.getModificarM().setEnabled(true);
				principal.addAll(vehi); // agregamos todos los vehiculos que se encuentran en vehi 
				encontrados.addAll(vehi); // y tambien los agregamos a encontrados que es otro arraylist
				vehi.clear(); // vaciamos todos los elementos de vehi
				listModel = new DefaultListModel(); 
				if(ventana.getFiltro().getSelectedItem().equals("Placa")) { // dependiendo del lo que el usuario elija asi mismo busca los vehiculos
					for(int i=0;i<encontrados.size();i++) {
						if(ventana.getBuscarV().getText().equalsIgnoreCase(encontrados.get(i).getPlaca())) { //  busca las placas en el arraylist de encontrados 
							System.out.println("Posiciones"+i+"\n");
							vehi.add(encontrados.get(i)); //los vehículos encontrados los guardan vehi
							principal.remove(encontrados.get(i));	// los elimina del principal	hace lo mismo en toda la condicion, solo depende de la seleccion del filtro				
						}
					}
				}else 	if(ventana.getFiltro().getSelectedItem().equals("Marca")) {
					for(int i=0;i<encontrados.size();i++) {
						if(ventana.getBuscarV().getText().equalsIgnoreCase(encontrados.get(i).getMarca())) {
							// creamos un modelo de lita para agregar la lista de vehiculos
							System.out.println("Posiciones"+i+"\n");
							vehi.add(encontrados.get(i));
							principal.remove(encontrados.get(i));
						}
					}
				}else 	if(ventana.getFiltro().getSelectedItem().equals("Referencia")) {
					for(int i=0;i<encontrados.size();i++) {
						if(ventana.getBuscarV().getText().equalsIgnoreCase(encontrados.get(i).getReferencia())) {
							System.out.println("Posiciones"+i+"\n");
							vehi.add(encontrados.get(i));
							principal.remove(encontrados.get(i));
						}
					}
				}else 	if(ventana.getFiltro().getSelectedItem().equals("Modelo")) {
					for(int i=0;i<encontrados.size();i++) {
						if(ventana.getBuscarV().getText().equalsIgnoreCase(Integer.toString(encontrados.get(i).getModelo()))) {
							// creamos un modelo de lita para agregar la lista de vehiculos
							System.out.println("Posiciones"+i+"\n");
							vehi.add(encontrados.get(i));
							principal.remove(encontrados.get(i));
						}
					}
				}else 	if(ventana.getFiltro().getSelectedItem().equals("Precio")) {
					for(int i=0;i<encontrados.size();i++) {
						if(Double.parseDouble(ventana.getBuscarV().getText())>= encontrados.get(i).getPrecio()) {
							// creamos un modelo de lita para agregar la lista de vehiculos
							System.out.println("Posiciones"+i+"\n");
							vehi.add(encontrados.get(i));
							principal.remove(encontrados.get(i));
						}
					}
				}
				listModel.addAll(vehi);  
				ventana.getList1().setModel(listModel);
				encontrados.clear(); // vacea el arraylist de encontrados
				vehi.addAll(principal); // agregs todo lo que hay en principal
				principal.clear(); // y elimina todo lo de principal, esto para manejar solo un arraylist con todo
			}
		});
	
				

	}
	// metodo que muestra la lista de los vehiculos
	@Override
	public void listarVehiculo() {
		ventana.getBoton2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.getPlacaM().setEnabled(false);  // inhabilita todos los campos y atributos del registro
				ventana.getMarcaM().setEnabled(false);
				ventana.getReferenciaM().setEnabled(false);
				ventana.getNumRuedasM().setEnabled(false);
				ventana.getModeloM().setEnabled(false);
				ventana.getPrecioM().setEnabled(false);
				ventana.getBoton1().setEnabled(false);
				ventana.getCapCarga().setEnabled(false);
				ventana.getCilindrajeM().setEnabled(false);
				ventana.getTamTanqueM().setEnabled(false);
				ventana.getNumPuertasV().setEnabled(false);
				ventana.getGasolinaV().setEnabled(false);
				ventana.getBuscarV().setText("");
				principal.addAll(vehi);
				vehi.clear();
				vehi.addAll(principal);
				principal.clear();
				if (vehi.size()== 0) {
					ventana.getEtiquetaAviso().setVisible(true); // si no hay vehiculos en el arreglo se  bota un mensaje que lo informa
				}else {
					listModel = new DefaultListModel(); // creamos un modelo de lita para agregar la lista de vehiculos
					listModel.addAll(vehi);	
					ventana.getList1().setModel(listModel); // a la lista de la pantalla se le agrega el modelo de lista con el arreglo de los vehivulos
					ventana.getBoton3().setEnabled(true); // activamos el boton de "vender"
					ventana.getEtiquetaAviso().setVisible(false);
					ventana.getModificarM().setEnabled(true);
					
				}
			}
		});
	}
	// metodo para vender vehiculos
	@Override
	public void venderVehiculo() {
		ventana.getBoton3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vendidos.add(vehi.get(ventana.getList1().getSelectedIndex())); // el vehiculo seleccionado en la lista se agrega a la lista de vendidos
				vehi.remove(ventana.getList1().getSelectedIndex()); // se remueve del arraylist de vehiculos
				listModel.remove(ventana.getList1().getSelectedIndex()); // y se remueve de la lista
			}
		});
		
		ventana.getBoton4().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel = new DefaultListModel(); // creamos un modelo de lista 
				listModel.addAll(vendidos);	// agregamos el arraylis con los vehiculos vendidos 
				ventana.getList1().setModel(listModel); // A la lista de la pantalla le agregamos el modelo de lista con el arreglo de los vehiculos vendidos
				ventana.getBoton3().setEnabled(false); // desactiva el boton de vendido
				ventana.getModificarM().setEnabled(false);
			}
		});
	}
	// metodo para mostrar las ventas
	@Override
	public void ventas() {

		ventana.getBoton5().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.getPlacaM().setEnabled(false);
				ventana.getMarcaM().setEnabled(false);
				ventana.getReferenciaM().setEnabled(false);
				ventana.getNumRuedasM().setEnabled(false);
				ventana.getModeloM().setEnabled(false);
				ventana.getPrecioM().setEnabled(false);
				ventana.getBoton1().setEnabled(false);
				ventana.getCapCarga().setEnabled(false);
				ventana.getCilindrajeM().setEnabled(false);
				ventana.getTamTanqueM().setEnabled(false);
				ventana.getNumPuertasV().setEnabled(false);
				ventana.getGasolinaV().setEnabled(false);
				ventana.getTextArea().setText(" ");
				ventana.getTextArea().append("VENTAS TOTALES \n"); // orden del texto
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("\n");
				double total=0; // variable para sumar el total de las ventas.
				for(int i=0;i<vendidos.size();i++) { // mostrar algunos atributos de los vehiculos vendidos
					ventana.getTextArea().append("Marca: "+vendidos.get(i).getMarca()+";   Placa: "+vendidos.get(i).getPlaca()+";  Numero de ruedas: "+vendidos.get(i).getNum_ruedas()+";  Precio: "+BigDecimal.valueOf(vendidos.get(i).getPrecio())+"\n");
					total=total+vendidos.get(i).getPrecio(); // se suman los precios
					BigDecimal.valueOf(total);
				}
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("Precio total:__________________________________________ " + BigDecimal.valueOf(total)); // big decimal para eliminar notacion cientifica // se imprime el total en un area de texto
			}
		});
		
	}
	// metodo que muestra la cantidad de vehiculos que existen
	@Override
	// metodo para contar la cantidad de motos y carros
	public void cantidadMotos() {
		ventana.getBoton8().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.getPlacaM().setEnabled(false);
				ventana.getMarcaM().setEnabled(false);
				ventana.getReferenciaM().setEnabled(false);
				ventana.getNumRuedasM().setEnabled(false);
				ventana.getModeloM().setEnabled(false);
				ventana.getPrecioM().setEnabled(false);
				ventana.getBoton1().setEnabled(false);
				ventana.getCapCarga().setEnabled(false);
				ventana.getCilindrajeM().setEnabled(false);
				ventana.getTamTanqueM().setEnabled(false);
				ventana.getNumPuertasV().setEnabled(false);
				ventana.getGasolinaV().setEnabled(false);
				ventana.getTextArea().setText("");
				int motos=0;  // variables para llevar las cuentas de la cantidad de motos y vehiculos que exisiten
				int carros=0;
				int camion=0;
				for (int i=0;i<vehi.size();i++) {
					if (vehi.get(i).getClass().equals(Moto.class)){ // si la clase que se encuentra es de ese tipo suma dependiendo del tipo de clase
						motos++;  
					}else if(vehi.get(i).getClass().equals(Auto.class)) {
						carros++;
					}else {
						camion++;
					}
				}
				ventana.getTextArea().append("************************************************");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("***********TOTAL DE VEHICULOS***********");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("************************************************");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("Motos en Stock: " + Integer.toString(motos));
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("---------------------------------------");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("Carros en Stock: " + Integer.toString(carros));
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("---------------------------------------");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("Camiones en Stock: " + Integer.toString(camion));
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("*************************************************");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("**********VEHICULOS VENDIDOS************");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("*************************************************");
				ventana.getTextArea().append("\n");
				ventana.getTextArea().append("Vehiculos vendidos: " + Integer.toString(vendidos.size())); // cuerpo del texto
				
			}
		});
			
		
	}
	// metodo para modificar los atributos de los vehiculos
	@Override
	public void modificar() {
		ventana.getModificarM().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.getPlacaM().setEnabled(false);  // seteamos todos los atributos
				ventana.getMarcaM().setEnabled(false);
				ventana.getReferenciaM().setEnabled(false);
				ventana.getNumRuedasM().setEnabled(false);
				ventana.getModeloM().setEnabled(false);
				ventana.getPrecioM().setEnabled(false);
				ventana.getBoton1().setEnabled(false);
				ventana.getCapCarga().setEnabled(false);
				ventana.getCilindrajeM().setEnabled(false);
				ventana.getTamTanqueM().setEnabled(false);
				ventana.getNumPuertasV().setEnabled(false);
				ventana.getGasolinaV().setEnabled(false);
				Modificar modificar = new Modificar();
				modificar.setVisible(true);
				modificar.getPlacaM().setText(vehi.get(ventana.getList1().getSelectedIndex()).getPlaca());		// seteamos cada atributo del vehiculo a modificar en la nueva ventana
				modificar.getMarcaM().setText(vehi.get(ventana.getList1().getSelectedIndex()).getMarca());
				modificar.getReferenciaM().setText(vehi.get(ventana.getList1().getSelectedIndex()).getReferencia());
				modificar.getPrecioM().setText(String.valueOf(vehi.get(ventana.getList1().getSelectedIndex()).getPrecio()));
				modificar.getNumeroRuedasM().setText(Integer.toString(vehi.get(ventana.getList1().getSelectedIndex()).getNum_ruedas()));
				modificar.getModeloM().setText(Integer.toString(vehi.get(ventana.getList1().getSelectedIndex()).getModelo()));
				//Vehiculo vehiculo = vehi.get(ventana.getList1().getSelectedIndex());
				if (vehi.get(ventana.getList1().getSelectedIndex())instanceof Moto) { // accede a los atributos especificos de la moto
					modificar.getTamañoTabque().setText(Float.toString(((Moto)vehi.get(ventana.getList1().getSelectedIndex())).getTam_tanque()));
					modificar.getCilindrajeM().setText(Integer.toString(((Moto)vehi.get(ventana.getList1().getSelectedIndex())).getCilindraje())); 
					modificar.getNumero_PuertasM().setEnabled(false); // desactiva los atributos que no son del vehiculo y setea los que si son del vehiculo
					modificar.getComboBox().setEnabled(false);
					modificar.getCapacidadCargaC().setEnabled(false);
				}else if(vehi.get(ventana.getList1().getSelectedIndex()) instanceof Auto) { // accede a los atributos especificos del vehiculo
					modificar.getNumero_PuertasM().setText(Integer.toString(((Auto)vehi.get(ventana.getList1().getSelectedIndex())).getNum_puertas()));
					modificar.getComboBox().setSelectedItem(((Auto)vehi.get(ventana.getList1().getSelectedIndex())).getIsGasolina());
					modificar.getTamañoTabque().setEnabled(false);  // desactiva los atributos que no son del vehiculo y setea los que si son del vehiculo
					modificar.getCilindrajeM().setEnabled(false);
					modificar.getCapacidadCargaC().setEnabled(false);
				}else if(vehi.get(ventana.getList1().getSelectedIndex()) instanceof Camion) { // accede a los atributos especificos del vehiculo
					modificar.getCapacidadCargaC().setText(Float.toString(((Camion)vehi.get(ventana.getList1().getSelectedIndex())).getCap_carga()));
					modificar.getTamañoTabque().setEnabled(false);  // desactiva los atributos que no son del vehiculo y setea los que si son del vehiculo
					modificar.getCilindrajeM().setEnabled(false);
					modificar.getNumero_PuertasM().setEnabled(false);
					modificar.getComboBox().setEnabled(false);
				}
				modificar.getBotonM().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							boolean esta = false;
							if (modificar.getPlacaM().getText().equalsIgnoreCase(vehi.get(ventana.getList1().getSelectedIndex()).getPlaca())){ // si es la misma placa deja registrar 
								vehi.get(ventana.getList1().getSelectedIndex()).setPlaca(modificar.getPlacaM().getText());
								vehi.get(ventana.getList1().getSelectedIndex()).setMarca(modificar.getMarcaM().getText());
								vehi.get(ventana.getList1().getSelectedIndex()).setReferencia(modificar.getReferenciaM().getText());
								vehi.get(ventana.getList1().getSelectedIndex()).setPrecio(Double.parseDouble(modificar.getPrecioM().getText()));
								vehi.get(ventana.getList1().getSelectedIndex()).setNum_ruedas(Integer.parseInt(modificar.getNumeroRuedasM().getText()));
								vehi.get(ventana.getList1().getSelectedIndex()).setModelo(Integer.parseInt(modificar.getModeloM().getText()));
								if (vehi.get(ventana.getList1().getSelectedIndex()) instanceof Moto) { // accede a los atributos especificos de la moto
									((Moto)vehi.get(ventana.getList1().getSelectedIndex())).setCilindraje(Integer.parseInt(modificar.getCilindrajeM().getText()));
									((Moto)vehi.get(ventana.getList1().getSelectedIndex())).setTam_tanque(Float.parseFloat(modificar.getTamañoTabque().getText()));
									modificar.getAdvertencia().setText("¡Registro exitoso!");
									modificar.getAdvertencia().setVisible(true);
									modificar.dispose();
								}else if(vehi.get(ventana.getList1().getSelectedIndex()) instanceof Auto) { // accede a los atributos especificos del vehiculo
									((Auto)vehi.get(ventana.getList1().getSelectedIndex())).setNum_puertas(Integer.parseInt(modificar.getNumero_PuertasM().getText()));
									((Auto)vehi.get(ventana.getList1().getSelectedIndex())).setIsGaolina((Gasolina)modificar.getComboBox().getSelectedItem());
									modificar.getAdvertencia().setText("¡Registro exitoso!");
									modificar.getAdvertencia().setVisible(true);
									modificar.dispose();
								}else if(vehi.get(ventana.getList1().getSelectedIndex()) instanceof Camion) { // accede a los atributos especificos del vehiculo
									((Camion)vehi.get(ventana.getList1().getSelectedIndex())).setCap_carga(Float.parseFloat(modificar.getCapacidadCargaC().getText()));
									modificar.getAdvertencia().setText("¡Registro exitoso!");
									modificar.getAdvertencia().setVisible(true);
									modificar.dispose();
								}
								
							}else {
								for(int i=0;i<vehi.size();i++) {
									if (modificar.getPlacaM().getText().equalsIgnoreCase(vehi.get(i).getPlaca())) { // si la placa es diferente verifica que la nueva no exista
										esta = true;
										modificar.getAdvertencia().setText("¡Vehiculo  ya Registrado!");
										modificar.getAdvertencia().setVisible(true);
										break;
										
									}else {
										esta=false;
									}	
								}
								if (esta==false) { // si la placa no esta, deja regsitrar, el vehiculo
									vehi.get(ventana.getList1().getSelectedIndex()).setPlaca(modificar.getPlacaM().getText());
									vehi.get(ventana.getList1().getSelectedIndex()).setMarca(modificar.getMarcaM().getText());
									vehi.get(ventana.getList1().getSelectedIndex()).setReferencia(modificar.getReferenciaM().getText());
									vehi.get(ventana.getList1().getSelectedIndex()).setPrecio(Double.parseDouble(modificar.getPrecioM().getText()));
									vehi.get(ventana.getList1().getSelectedIndex()).setNum_ruedas(Integer.parseInt(modificar.getNumeroRuedasM().getText()));
									vehi.get(ventana.getList1().getSelectedIndex()).setModelo(Integer.parseInt(modificar.getModeloM().getText()));
									modificar.getAdvertencia().setText("¡Registro exitoso!");
									modificar.getAdvertencia().setVisible(true);
									if (vehi.get(ventana.getList1().getSelectedIndex()) instanceof Moto) { // accede a los atributos especificos de la moto
										((Moto)vehi.get(ventana.getList1().getSelectedIndex())).setCilindraje(Integer.parseInt(modificar.getCilindrajeM().getText()));
										((Moto)vehi.get(ventana.getList1().getSelectedIndex())).setTam_tanque(Float.parseFloat(modificar.getTamañoTabque().getText()));
										modificar.dispose();
									}else if(vehi.get(ventana.getList1().getSelectedIndex()) instanceof Auto) { // accede a los atributos especificos del vehiculo
										((Auto)vehi.get(ventana.getList1().getSelectedIndex())).setNum_puertas(Integer.parseInt(modificar.getNumero_PuertasM().getText()));
										((Auto)vehi.get(ventana.getList1().getSelectedIndex())).setIsGaolina((Gasolina)modificar.getComboBox().getSelectedItem());
										modificar.dispose();
									}else if(vehi.get(ventana.getList1().getSelectedIndex()) instanceof Camion) { // accede a los atributos especificos del vehiculo
										((Camion)vehi.get(ventana.getList1().getSelectedIndex())).setCap_carga(Float.parseFloat(modificar.getCapacidadCargaC().getText()));
										modificar.dispose();
									}
								}	
							}
							ventana.getBuscarV().setText("");
							principal.addAll(vehi);
							vehi.clear();
							vehi.addAll(principal);
							principal.clear();
							ventana.getBoton3().setEnabled(true); // activamos el boton de "vender"
							ventana.getEtiquetaAviso().setVisible(false);
							ventana.getModificarM().setEnabled(true);
								
					}
				});
				
			}
		});
	}
	// metodo para eliminar vehiculos 
	@Override
	// metodo para eliminar vehiculos
	public void eliminar() {
		ventana.getBoton7().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vehi.remove(ventana.getList1().getSelectedIndex());
				
				listModel.remove(ventana.getList1().getSelectedIndex()); // selecciona la posicion de la lista y elimina el objeto en esa posicion
				
			}
		});
			
		
	}
	
	
	
}
