package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoUsuario;
import datos.Gerente;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaRegistroGerente extends JFrame {

	private JPanel contentPane;
	private JTextField textFielddni;
	private JTextField textFieldPassword;
	private JTextField textFieldUsuario;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaRegistroGerente frame = new PantallaRegistroGerente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaRegistroGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButtonRegistro = new JButton("Registrarse");
		btnNewButtonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListadoUsuario Usuarios = new ListadoUsuario();
				Gerente gerentes = new Gerente();
				gerentes.setDni(textFielddni.getText());
				gerentes.setNombre(textFieldUsuario.getText());
				gerentes.setPassword(textFieldPassword.getText());
				gerentes.setNivel(2);
				
				if(Usuarios.add(gerentes)) {
					 //JOptionPane.showMessageDialog(null, "Se agregó correctamente el Gerente.");				
						PantallaExitoRegistro exito = new PantallaExitoRegistro();
						exito.run();
				 }else {
					 //JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el Gerente.");
					 PantallaFailRegistro fail = new PantallaFailRegistro();
					 fail.run();
				 }
			}
		});
		btnNewButtonRegistro.setBounds(125, 213, 169, 23);
		contentPane.add(btnNewButtonRegistro);
		
		textFielddni = new JTextField();
		textFielddni.setColumns(10);
		textFielddni.setBounds(103, 174, 212, 20);
		contentPane.add(textFielddni);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(103, 159, 128, 14);
		contentPane.add(lblDni);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(103, 132, 212, 20);
		contentPane.add(textFieldPassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(103, 118, 128, 14);
		contentPane.add(lblPassword);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(103, 92, 212, 20);
		contentPane.add(textFieldUsuario);
		
		JLabel lblUsuario = new JLabel("Nombre Usuario");
		lblUsuario.setBounds(103, 77, 128, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblEncabezado = new JLabel("Registro");
		lblEncabezado.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEncabezado.setBounds(157, 0, 212, 75);
		contentPane.add(lblEncabezado);
	}

}
