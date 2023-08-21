package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Gasolina;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;

public class Principal extends JFrame {
	private JButton Buscar;
	private JComboBox filtro;
	private JButton boton8;
	private JPanel contentPane;
	private JTextField PlacaM;
	private JTextField MarcaM;
	private JTextField ReferenciaM;
	private JTextField PrecioM;
	private JTextField NumRuedasM;
	private JTextField CilindrajeM;
	private JTextField TamTanqueM;
	private JTextField ModeloM;
	private JButton Boton1;
	private JPanel panel;
	private JList list1;
	private JButton boton2;
	private JPanel panel2;
	private JButton boton3;
	private JButton boton4;
	private JPanel panel3;
	private JButton boton5;
	private JTextArea textArea;
	private JTextField numPuertasV;
	private JComboBox GasolinaV ;
	private JPanel panel4;
	private JLabel mensaje ;
	private JButton Boton7;
	private JLabel etiquetaAviso;
	private JButton ModificarM;
	private JTextField buscarV;
	private JComboBox tipoVehiculo;
	private JTextField capCarga;
	private JButton Selected;
	
	public JButton getSelected() {
		return Selected;
	}

	public JTextField getCapCarga() {
		return capCarga;
	}

	public void setList1(JList list1) {
		this.list1 = list1;
	}

	public JButton getModificarM() {
		return ModificarM;
	}

	public JButton getBuscar() {
		return Buscar;
	}

	public JComboBox getFiltro() {
		return filtro;
	}

	public JTextField getBuscarV() {
		return buscarV;
	}
	
	public JComboBox getTipoVehiculo() {
		return tipoVehiculo;
	}

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 933, 549);
		contentPane.add(tabbedPane);
		
		Gasolina []gasolina= {Gasolina.NO,Gasolina.SI};
		
		String [] tipos = {"Auto","Camion","Moto"};
		
		panel2 = new JPanel();
		tabbedPane.addTab("Listas", null, panel2, null);
		panel2.setLayout(null);
		
		boton2 = new JButton("MostrarVehiculos");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		list1 = new JList();
		list1.setBounds(20, 73, 898, 437);
		panel2.add(list1);
		boton2.setBounds(10, 45, 113, 23);
		panel2.add(boton2);
		
		boton3 = new JButton("Vender");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton3.setBounds(793, 45, 125, 23);
		panel2.add(boton3);
		
		boton4 = new JButton("Mostrar Vendidos");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton4.setBounds(793, 11, 125, 23);
		panel2.add(boton4);
		
		Boton7 = new JButton("Eliminar\r\n");
		Boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Boton7.setBounds(10, 22, 113, 23);
		panel2.add(Boton7);
		
		etiquetaAviso = new JLabel("No hay vehiculos disponibles\r\n");
		etiquetaAviso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiquetaAviso.setVisible(false);
		etiquetaAviso.setBounds(133, 36, 281, 36);
		panel2.add(etiquetaAviso);
		
		ModificarM = new JButton("Modificar");
		ModificarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ModificarM.setEnabled(false);;
		ModificarM.setBounds(698, 45, 89, 23);
		panel2.add(ModificarM);
		
		buscarV = new JTextField();
		buscarV.setText("");
		buscarV.setEnabled(true);
		buscarV.setEditable(true);
		buscarV.setColumns(10);
		buscarV.setBounds(526, 46, 86, 20);
		panel2.add(buscarV);
		
		Buscar = new JButton("Buscar");
		Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Buscar.setBounds(523, 22, 89, 23);
		panel2.add(Buscar);
		
		String [] filtrado= {"Placa","Marca","Referencia","Modelo","Precio"};
		filtro = new JComboBox(filtrado);
		filtro.setBounds(436, 45, 80, 22);
		panel2.add(filtro);
		
		panel3 = new JPanel();
		tabbedPane.addTab("Ventas", null, panel3, null);
		panel3.setLayout(null);
		
		boton5 = new JButton("ConsultarVentas");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton5.setBounds(20, 11, 137, 23);
		panel3.add(boton5);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(20, 45, 555, 309);
		panel3.add(textArea);
		
		boton8 = new JButton("Contar");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton8.setBounds(486, 11, 89, 23);
		panel3.add(boton8);
		
		panel = new JPanel();
		tabbedPane.addTab("Registrar Vehiculos", null, panel, null);
		panel.setLayout(null);
		
		PlacaM = new JTextField();
		PlacaM.setEnabled(false);
		PlacaM.setBounds(10, 31, 86, 20);
		panel.add(PlacaM);
		PlacaM.setColumns(10);
		
		MarcaM = new JTextField();
		MarcaM.setEnabled(false);
		MarcaM.setBounds(192, 31, 86, 20);
		panel.add(MarcaM);
		MarcaM.setColumns(10);
		
		ReferenciaM = new JTextField();
		ReferenciaM.setEnabled(false);
		ReferenciaM.setBounds(370, 31, 86, 20);
		panel.add(ReferenciaM);
		ReferenciaM.setColumns(10);
		
		PrecioM = new JTextField();
		PrecioM.setEditable(true);
		PrecioM.setEnabled(false);
		PrecioM.setText("");
		PrecioM.setBounds(370, 124, 86, 20);
		panel.add(PrecioM);
		PrecioM.setColumns(10);
		
		NumRuedasM = new JTextField();
		NumRuedasM.setEnabled(false);
		NumRuedasM.setBounds(10, 124, 86, 20);
		panel.add(NumRuedasM);
		NumRuedasM.setColumns(10);
		
		CilindrajeM = new JTextField();
		CilindrajeM.setEnabled(false);
		CilindrajeM.setBounds(370, 220, 86, 20);
		panel.add(CilindrajeM);
		CilindrajeM.setColumns(10);
		
		TamTanqueM = new JTextField();
		TamTanqueM.setEnabled(false);
		TamTanqueM.setBounds(370, 300, 86, 20);
		panel.add(TamTanqueM);
		TamTanqueM.setColumns(10);
		
		ModeloM = new JTextField();
		ModeloM.setEnabled(false);
		ModeloM.setEditable(true);
		ModeloM.setText("");
		ModeloM.setBounds(192, 124, 86, 20);
		panel.add(ModeloM);
		ModeloM.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Placa ");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		lblNewLabel_1.setBounds(192, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Referencia");
		lblNewLabel_2.setBounds(370, 11, 69, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(370, 109, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Numero de Ruedas");
		lblNewLabel_4.setBounds(10, 109, 112, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cilindraje");
		lblNewLabel_5.setBounds(370, 202, 126, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tamaño de Tanque");
		lblNewLabel_6.setBounds(370, 284, 172, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Modelo");
		lblNewLabel_7.setBounds(192, 109, 46, 14);
		panel.add(lblNewLabel_7);
		
		Boton1 = new JButton("Registrar");
		Boton1.setEnabled(false);
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Boton1.setBounds(192, 299, 89, 23);
		panel.add(Boton1);
		
		numPuertasV = new JTextField();
		numPuertasV.setEnabled(false);
		numPuertasV.setBounds(10, 220, 86, 20);
		panel.add(numPuertasV);
		numPuertasV.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Numero de puertas");
		lblNewLabel_13.setBounds(10, 202, 141, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Gasolina");
		lblNewLabel_14.setBounds(10, 284, 141, 14);
		panel.add(lblNewLabel_14);
		GasolinaV = new JComboBox(gasolina);
		GasolinaV.setEnabled(false);
		GasolinaV.setBounds(10, 299, 75, 22);
		panel.add(GasolinaV);
		
		mensaje = new JLabel("Atencion. ¡El vehiculo se encuentra registrado!");
		mensaje.setBounds(559, 178, 340, 14);
		mensaje.setVisible(false);
		panel.add(mensaje);
		tipoVehiculo = new JComboBox(tipos);
		tipoVehiculo.setBounds(637, 30, 86, 22);
		panel.add(tipoVehiculo);
		
		JLabel lblNewLabel_16 = new JLabel("Tipo de Vehiculo");
		lblNewLabel_16.setBounds(636, 11, 126, 14);
		panel.add(lblNewLabel_16);
		
		capCarga = new JTextField();
		capCarga.setColumns(10);
		capCarga.setBounds(192, 220, 86, 20);
		capCarga.setEnabled(false);
		panel.add(capCarga);
		
		JLabel lblNewLabel_17 = new JLabel("Capacidad de Carga");
		lblNewLabel_17.setBounds(191, 202, 126, 14);
		panel.add(lblNewLabel_17);
		
		Selected = new JButton("Seleccionar");
		Selected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Selected.setBounds(637, 58, 86, 23);
		panel.add(Selected);
	
		
	}
	
	public JButton getBoton8() {
		return boton8;
	}

	public JLabel getEtiquetaAviso() {
		return etiquetaAviso;
	}

	public JLabel getMensaje() {
		return mensaje;
	}

	public JButton getBoton7() {
		return Boton7;
	}



	public JPanel getPanel4() {
		return panel4;
	}

	public JTextField getNumPuertasV() {
		return numPuertasV;
	}

	public JComboBox getGasolinaV() {
		return GasolinaV;
	}

	public JPanel getPanel3() {
		return panel3;
	}

	public JButton getBoton5() {
		return boton5;
	}

	public JButton getBoton4() {
		return boton4;
	}

	public JButton getBoton3() {
		return boton3;
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	public JTextField getPlacaM() {
		return PlacaM;
	}
	public JTextField getMarcaM() {
		return MarcaM;
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}

	public JTextField getReferenciaM() {
		return ReferenciaM;
	}
	public JTextField getPrecioM() {
		return PrecioM;
	}
	public JTextField getNumRuedasM() {
		return NumRuedasM;
	}
	public JTextField getCilindrajeM() {
		return CilindrajeM;
	}
	public JTextField getTamTanqueM() {
		return TamTanqueM;
	}
	public JTextField getModeloM() {
		return ModeloM;
	}
	public JButton getBoton1() {
		return Boton1;
	}
	public JPanel getPanel() {
		return panel;
	}
	public JList getList1() {
		return list1;
	}
	public JPanel getPanel2() {
		return panel2;
	}
	public JButton getBoton2() {
		return boton2;
	}
}
