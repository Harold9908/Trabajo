package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Gasolina;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modificar extends JFrame {
	private JComboBox comboBox;
	private JPanel contentPane;
	private JTextField PlacaM;
	private JTextField MarcaM;
	private JTextField ReferenciaM;
	private JTextField PrecioM;
	private JTextField NumeroRuedasM;
	private JTextField ModeloM;
	private JTextField CilindrajeM;
	private JTextField tamañoTabque;
	private JTextField numero_PuertasM;
	private JButton BotonM; 
	private JLabel advertencia;
	private JTextField capacidadCargaC;
	private JLabel lblNewLabel_10;
	private JButton btnNewButton;
	
	
	public JTextField getCapacidadCargaC() {
		return capacidadCargaC;
	}


	public JLabel getLblNewLabel_10() {
		return lblNewLabel_10;
	}


	public JLabel getAdvertencia() {
		return advertencia;
	}


	public JComboBox getComboBox() {
		return comboBox;
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


	public JTextField getReferenciaM() {
		return ReferenciaM;
	}


	public JTextField getPrecioM() {
		return PrecioM;
	}


	public JTextField getNumeroRuedasM() {
		return NumeroRuedasM;
	}


	public JTextField getModeloM() {
		return ModeloM;
	}


	public JTextField getCilindrajeM() {
		return CilindrajeM;
	}


	public JTextField getTamañoTabque() {
		return tamañoTabque;
	}


	public JTextField getNumero_PuertasM() {
		return numero_PuertasM;
	}


	public JButton getBotonM() {
		return BotonM;
	}


	public Modificar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PlacaM = new JTextField();
		PlacaM.setBounds(31, 48, 86, 20);
		contentPane.add(PlacaM);
		PlacaM.setColumns(10);
		
		MarcaM = new JTextField();
		MarcaM.setBounds(171, 48, 86, 20);
		contentPane.add(MarcaM);
		MarcaM.setColumns(10);
		
		ReferenciaM = new JTextField();
		ReferenciaM.setBounds(308, 48, 86, 20);
		contentPane.add(ReferenciaM);
		ReferenciaM.setColumns(10);
		
		PrecioM = new JTextField();
		PrecioM.setBounds(31, 100, 86, 20);
		contentPane.add(PrecioM);
		PrecioM.setColumns(10);
		
		NumeroRuedasM = new JTextField();
		NumeroRuedasM.setText("");
		NumeroRuedasM.setBounds(171, 100, 86, 20);
		contentPane.add(NumeroRuedasM);
		NumeroRuedasM.setColumns(10);
		
		ModeloM = new JTextField();
		ModeloM.setBounds(308, 100, 86, 20);
		contentPane.add(ModeloM);
		ModeloM.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Placa\r\n");
		lblNewLabel.setBounds(31, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		lblNewLabel_1.setBounds(171, 35, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Referencia");
		lblNewLabel_2.setBounds(308, 35, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(31, 85, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Numero de Ruedas");
		lblNewLabel_4.setBounds(171, 85, 104, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Modelo\r\n");
		lblNewLabel_5.setBounds(307, 85, 70, 14);
		contentPane.add(lblNewLabel_5);
		
		CilindrajeM = new JTextField();
		CilindrajeM.setColumns(10);
		CilindrajeM.setBounds(31, 167, 86, 20);
		contentPane.add(CilindrajeM);
		
		tamañoTabque = new JTextField();
		tamañoTabque.setColumns(10);
		tamañoTabque.setBounds(31, 210, 86, 20);
		contentPane.add(tamañoTabque);
		
		JLabel lblNewLabel_6 = new JLabel("Cilindraje\r\n");
		lblNewLabel_6.setBounds(31, 151, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Tamaño de tanque\r\n");
		lblNewLabel_7.setBounds(31, 198, 133, 14);
		contentPane.add(lblNewLabel_7);
		
		numero_PuertasM = new JTextField();
		numero_PuertasM.setColumns(10);
		numero_PuertasM.setBounds(308, 167, 86, 20);
		contentPane.add(numero_PuertasM);
		
		JLabel lblNewLabel_8 = new JLabel("Numero de puertas\r\n");
		lblNewLabel_8.setBounds(308, 151, 104, 14);
		contentPane.add(lblNewLabel_8);
		
		Gasolina[]gasolina= {Gasolina.NO, Gasolina.SI};
		comboBox = new JComboBox(gasolina);
		comboBox.setBounds(308, 209, 86, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_9 = new JLabel("Gasolina");
		lblNewLabel_9.setBounds(308, 198, 88, 14);
		contentPane.add(lblNewLabel_9);
		
		BotonM = new JButton("Modificar");
		BotonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonM.setBounds(308, 268, 89, 23);
		contentPane.add(BotonM);
		
		advertencia = new JLabel("¡Placa registrada!");
		advertencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		advertencia.setBounds(31, 241, 133, 20);
		advertencia.setVisible(false);
		contentPane.add(advertencia);
		
		capacidadCargaC = new JTextField();
		capacidadCargaC.setColumns(10);
		capacidadCargaC.setBounds(171, 167, 86, 20);
		contentPane.add(capacidadCargaC);
		
		lblNewLabel_10 = new JLabel("Capacidad de carga");
		lblNewLabel_10.setBounds(171, 151, 115, 14);
		contentPane.add(lblNewLabel_10);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(308, 302, 89, 23);
		contentPane.add(btnNewButton);
	}
}
